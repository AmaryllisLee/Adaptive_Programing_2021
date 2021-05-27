package dijkstra_shortest_path;

import java.util.ArrayList;
import java.util.LinkedList;

public class Reis implements Comparable<Reis> {
    LinkedList<Node> nodes;
    Integer distance;

    public Reis (LinkedList<Node> nodes) throws Exception{
        this.nodes = nodes;

        //  Calculate distance for a Reis
        Integer sumDistance = 0;
        for(int i = 0;i< nodes.size() -1;i++ ){ //  iterate through each node in nodes

            ArrayList<Stap> stapRoute = nodes.get(i).getStapRoutes(); // get stapRoutes

            boolean stap_exist =false; // stap_exist monitor whether a Stap exist  between two nodes

            for (int j = 0;j < stapRoute.size();j++){   // iterate through each stap
                Stap stap = stapRoute.get(j); // get stap
                if (stap.getStartnode() == nodes.get(i) && stap.getEndnode() == nodes.get(i+1)){ //check  if stap exist between nodes[i] and nodes[i+1]
                    stap_exist = true;  // set stap_exist to true
                    sumDistance += stap.getValue();  // increment  sumDistance with value of Stap
                    break;
                }
            }
            if (!stap_exist){ // throws exception if stap does not exist
                throw new Exception(String.format("Stap van %s naar %s bestaat niet", nodes.get(i).getName(), nodes.get(i+1).getName() ));}

        }
        distance = sumDistance;
    }

    public Integer getDistance() {
        return distance;
    }


    @Override
    /**
     * Compare two Reis with each other based on the distance.
     * Return 0 if the two Reis object are equal
     *        1 if Reis is greater than Reis r
     *        -1 if Reis is less than Reis r
     */
    public int compareTo(Reis r)
    {
        if(this.distance > r.getDistance()){
            return 1;
        }
        else if ( this.distance <  r.getDistance())
        {
            return -1;
        }
        return 0;
    }





    //Bron :
    // https://stackoverflow.com/questions/6952660/java-priority-queue-reordering-when-editing-elements?lq=1
    //https://www.tutorialspoint.com/can-a-constructor-throw-an-exception-in-java




}