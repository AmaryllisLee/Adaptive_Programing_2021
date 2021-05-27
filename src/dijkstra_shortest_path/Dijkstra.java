package dijkstra_shortest_path;
import java.util.ArrayList;;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Dijkstra {

    /**
     * Determines the shortest path and distance from the startNode to all other other Nodes
     * @param startNode
     * @return
     */
    public ArrayList<Node> calculateBestPath(Node startNode){

        //Create a PriorityQueue for the unsettlednode and add startNode.
        // The unsettlednodes cconatins the nodes that we don't know the shortest path from  the startNode
        PriorityQueue<Node> unsettlednode = new PriorityQueue<Node>(new NodeComparator());
        unsettlednode.add(startNode);

        // Create Arraylist for the settlednode, which contains the nodes with the known shortest patth from the startNode
        ArrayList<Node> settlednode = new ArrayList<Node>();


        Node evaluationnode = null;

        unsettlednode.peek().setAmount(0); // set the distance of the start node to 0
        LinkedList<Node> initialShortestPath = new LinkedList<Node>();
        initialShortestPath.add(unsettlednode.peek());//add the startNode(first element in PriorityQueue) in the Linkedlist
        // peek() : get head of the  PriorityQueue
        unsettlednode.peek().setShortestPath(initialShortestPath); // set the shortest path of the startNode to  initialShortestPath

        while(unsettlednode.size() > 0) {
            evaluationnode = unsettlednode.poll(); // fetch and removes the first element the from the Queue

            for(int i = 0;i < evaluationnode.getStapRoutes().size();i++){ // iterate through Staps in the StapRoutes
                Stap stapRoute = evaluationnode.getStapRoutes().get(i);

                //  check if (the sum of the distance of the evaluationnode and the added distance ( "edge weight")) is less than the destination's distance.
                if((evaluationnode.getAmount() +stapRoute.getValue()) < stapRoute.getEndnode().getAmount()){
                    stapRoute.getEndnode().setAmount(evaluationnode.getAmount() +stapRoute.getValue()); // set the destination's distance to the sum of the evaluationnode's distance and the added distance/


                    LinkedList<Node> ultimateShortPath = (LinkedList<Node>) evaluationnode.getShortestPath().clone();// clone shortestPath of evaluationnode
                    ultimateShortPath.add(stapRoute.getEndnode());// add destination's  node
                    stapRoute.getEndnode().setShortestPath(ultimateShortPath); // set ultimateShortPath to the shortestpath of destination's node

                    if (!settlednode.contains(stapRoute.getEndnode()) && !unsettlednode.contains(stapRoute.getEndnode())){ // check if destination's node is not in the settled
                        unsettlednode.add(stapRoute.getEndnode()); //  add destination's node too unsettlednode
                    }
                }
            }
            settlednode.add(evaluationnode); // add evaluationnode to settlednode
        }// end of while loop
        return settlednode;
    }
}
