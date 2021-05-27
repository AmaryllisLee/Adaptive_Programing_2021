package dijkstra_shortest_path;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class ReisTest {
    // define nodes
    Node ta = new Node("A");
    Node tb = new Node("B");
    Node tc = new Node("C");
    Node td = new Node("D");
    Node te = new Node("E");
    Node tf = new Node("F");


    @BeforeEach
    public void init() {
        // Define Treinrit and  add it to stapRoutes of given node.
        ta.addPath(new Treinrit(ta, tb, 10));
        ta.addPath(new Treinrit(ta, tc, 15));

        tb.addPath(new Treinrit(tb, tf, 15));
        tb.addPath(new Treinrit(tb, td, 12));

        tc.addPath(new Treinrit(tc, te, 10));
        td.addPath(new Treinrit(td, te, 2));
        td.addPath(new Treinrit(td, tf, 1));
        tf.addPath(new Treinrit(tf, te, 5));

    }
    @Test
    void compareTo() {
        LinkedList<Node> r0 = new LinkedList<Node>(); // define first trip (Reis object)
        r0.add(ta);
        r0.add(tb);
        r0.add(tf);
        r0.add(te);

        LinkedList<Node> r1 = new LinkedList<Node>();  // define trip journey (Reis object)
        r1.add(ta);
        r1.add(tb);
        r1.add(td);
        r1.add(te);

        try {
            Reis treinreis0 = new Reis(r0);
            Reis treinreis1 = new Reis(r1);
            System.out.println("Trein reis 0 " + r0 +" distance: " + treinreis0.getDistance());
            System.out.println("Trein reis 1 " + r1 +" distance: " + treinreis1.getDistance());

            assertEquals(1, treinreis0.compareTo(treinreis1));
            assertEquals(-1, treinreis1.compareTo(treinreis0));
        } catch (Exception fout) {
            System.out.println("Error: " + fout.getMessage());
        }
    }


}