package dijkstra_shortest_path;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Main {


    public static void main(String[] arg) {
        // Define Dijkstra object
        Dijkstra dijkstra = new Dijkstra();

        //Treinrit
        //In order to test the Treinrit en Vlucht, I will be using the example graph given in Baeldung(the link of this website  is listed at the bottom of the file).

        // Define Nodes. The variable names will  be ta, tb...tf in reference to trein a,   trein b, etc.
        Node ta = new Node("A");
        Node tb = new Node("B");
        Node tc = new Node("C");
        Node td = new Node("D");
        Node te = new Node("E");
        Node tf = new Node("F");

        // Define Treinrit and  add it to stapRoutes of given node.
        ta.addPath(new Treinrit(ta, tb, 10));
        ta.addPath(new Treinrit(ta, tc, 15));

        tb.addPath(new Treinrit(tb, tf, 15));
        tb.addPath(new Treinrit(tb, td, 12));

        tc.addPath(new Treinrit(tc, te, 10));
        td.addPath(new Treinrit(td, te, 2));
        td.addPath(new Treinrit(td, tf, 1));
        tf.addPath(new Treinrit(tf, te, 5));

        ArrayList<Node> bestPath = dijkstra.calculateBestPath(ta); // calculating shortest  path for every node.

        // Visualize the shortestPaths and the time for each node
        System.out.println("Node    Tijd     Kortse pad");
        for (int i = 0; i < bestPath.size(); i++) {
            System.out.println(bestPath.get(i).getName() + "        " + bestPath.get(i).getAmount() + "      " + bestPath.get(i).getShortestPath());
        }


        //print new line
        System.out.println("\n");

        //vlucht
        // Define Nodes. The variable names will  be va, vb...vf in reference to vlucht a,   vlucht b, etc.
        Node va = new Node("A");
        Node vb = new Node("B");
        Node vc = new Node("C");
        Node vd = new Node("D");
        Node ve = new Node("E");
        Node vf = new Node("F");


        // Define Vlucht and  add it to stapRoutes of given node.
        va.addPath(new Vlucht(va, vb, 10, 0.2));
        va.addPath(new Vlucht(va, vc, 15, 0.2));

        vb.addPath(new Vlucht(vb, vf, 15, 0.4));
        vb.addPath(new Vlucht(vb, vd, 12, 0.5));

        vc.addPath(new Vlucht(vc, ve, 10, 0.5));

        vd.addPath(new Vlucht(vd, vf, 1, 1.0));
        vd.addPath(new Vlucht(vd, ve, 2, 0.5));

        vf.addPath(new Vlucht(vf, ve, 5, 0.6));


        ArrayList<Node> bestPathVlucht = dijkstra.calculateBestPath(va);// calculate cheapest path for a given node

         // Visualize the shortestPaths and the cost for each node
        System.out.println("Node    Kosten    Kortste pad");
        for (int i = 0; i < bestPathVlucht.size(); i++) {
            System.out.println(bestPathVlucht.get(i).getName() + "       " + bestPathVlucht.get(i).getAmount()+"         " + bestPathVlucht.get(i).getShortestPath());
        }

        //print a new line
        System.out.println("\n");


        //Rit
        //For Rit I wil be  using another graph  example. The graph example is from CodingGame and the link  is is liisted at the bottom of the file)

        // / Define Nodes. The variable names will  be ca, cb, cc...ce in reference to car(auto) a,   car b, etc.
        Node ca = new Node("a");
        Node cb = new Node("b");
        Node cc = new Node("c");
        Node cd = new Node("d");
        Node ce = new Node("e");

        // Define Rit and  add it to stapRoutes of given node.
        cc.addPath(new Rit(cc, ca, 1));
        cc.addPath(new Rit(cc, cb, 7));
        cc.addPath(new Rit(cc, cd, 2));
        ca.addPath(new Rit(ca, cb, 3));
        cb.addPath(new Rit(cb, ce, 1));
        cd.addPath(new Rit(cd, ce, 7));
        cd.addPath(new Rit(cd, cb, 5));


        // The startNode in this graph example is  cc ("c")
        ArrayList<Node> bestPathAuto = dijkstra.calculateBestPath(cc); // calculate fastest path for a given node

        // Visualize the shortestPaths and the distance for each node
        System.out.println("Node    Afstand   Kortse pad");
        for (int i = 0; i < bestPathAuto.size(); i++) {
            System.out.println(bestPathAuto.get(i).getName() + "        " + bestPathAuto.get(i).getAmount() + "       " + bestPathAuto.get(i).getShortestPath());
        }

    }
}



/*
Sources

1. Graph example of Baeldung for Treinrit and Vlucht: https://www.baeldung.com/java-dijkstra
2. Graph example of CodingGame for Rit: https://www.codingame.com/playgrounds/1608/shortest-paths-with-dijkstras-algorithm/dijkstras-algorithm
 */
