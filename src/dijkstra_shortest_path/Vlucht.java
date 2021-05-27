package dijkstra_shortest_path;

import java.util.HashMap;

public class Vlucht extends Stap {
    Integer  euro;
    Double kansBagageKwijt;


    public Vlucht(Node startn, Node endn, Integer euro, Double kansBagageKwijt){
        super(startn, endn);
        this.euro = euro;
        this.kansBagageKwijt = kansBagageKwijt;
    }

    @Override
    /**
     * Get cost(value)of vlucht based on the euro and the probability of losing a luggage
     * return: cost
     */
    Integer getValue() {
        Integer cost =(int) Math.round(euro * (1+kansBagageKwijt));
        return cost;
    }
}

//Bron:
//https://www.geeksforgeeks.org/convert-double-to-integer-in-java/