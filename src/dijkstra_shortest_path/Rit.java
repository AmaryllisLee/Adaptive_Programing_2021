package dijkstra_shortest_path;

import java.util.HashMap;

public class Rit extends Stap {
    Integer kilometers;

    public Rit(Node startn, Node endn, Integer kilometers){
        super(startn, endn);
        this.kilometers = kilometers;
    }

    @Override
    /**
     * Get distance
     * return: kilometers
     */
    Integer getValue() {
        return kilometers;
    }
}
