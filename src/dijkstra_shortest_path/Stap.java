package dijkstra_shortest_path;

import java.util.Comparator;
import java.util.HashMap;

public abstract class Stap {
    private Node startnode;
    private Node endnode;

    public Stap(Node startnode, Node endnode) {
        this.startnode = startnode;
        this.endnode = endnode;
    }

    abstract Integer getValue(); // abstract method


    public Node getStartnode() {

        return startnode;
    }


    public Node getEndnode() {

        return endnode;
    }
}
//Source:
//abstract method: https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html


