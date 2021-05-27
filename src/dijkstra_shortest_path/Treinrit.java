package dijkstra_shortest_path;

import java.util.HashMap;

public class Treinrit extends Stap{
    Integer duration ;


    public Treinrit(Node startn, Node endn, Integer duration){
        super(startn, endn);
        this.duration = duration;}

    @Override
    /**
     * Get duration(value)
     * return: duration
     */
    Integer getValue() {
        return duration;
    }
}

