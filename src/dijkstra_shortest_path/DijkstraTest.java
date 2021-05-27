package dijkstra_shortest_path;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;


import static org.junit.jupiter.api.Assertions.*;

class DijkstraTest {
    /*
    I wil  be testing the dijkstra algorithm .For this Test I will be using the graph example from this video:
    Furthermore I will be using the Rit class for my Stap.
    Source:
    https://www.youtube.com/watch?v=_lHSawdgXpI
     */
    Node a = new Node("A");
    Node b = new Node("B");
    Node c = new Node("C");
    Node d = new Node("D");
    Node e = new Node("E");

    @BeforeEach
    public void init() {
        a.addPath(new Rit(a, b, 4));
        a.addPath(new Rit(a, c, 2));

        b.addPath(new Rit(b, c, 3));
        b.addPath(new Rit(b, d, 2));
        b.addPath(new Rit(b, e, 3));

        c.addPath(new Rit(c, b, 1));
        c.addPath(new Rit(c, d, 4));
        c.addPath(new Rit(c, e, 5));
        e.addPath(new Rit(e, d, 1));
    }
    @Test
    void calculateBestPath_correct_output() {
        Dijkstra dijkstra = new Dijkstra();


        ArrayList<Node>  expected_output  = new ArrayList<>(Arrays.asList(a, c, b, d, e));
        ArrayList<Node> actual_output = dijkstra.calculateBestPath(a);  // returns [a, c, b, d, e]
        assertEquals(expected_output, actual_output);

    }

    @Test
    void calculateBestPath_ShortestPath(){
        Dijkstra dijkstra = new Dijkstra();

        ArrayList<Node> result = dijkstra.calculateBestPath(a);

        // Create expected shortestPath for each node
        LinkedList<Node> expected_outputs_A  = new LinkedList<>();
        expected_outputs_A.add(a);
        LinkedList<Node> expected_outputs_B  = new LinkedList<>();
        expected_outputs_B.add(a);
        expected_outputs_B.add(c);
        expected_outputs_B.add(b);
        LinkedList<Node> expected_outputs_C  = new LinkedList<>();
        expected_outputs_C.add(a);
        expected_outputs_C.add(c);
        LinkedList<Node> expected_outputs_D  = new LinkedList<>();
        expected_outputs_D.add(a);
        expected_outputs_D.add(c);
        expected_outputs_D.add(b);
        expected_outputs_D.add(d);
        LinkedList<Node> expected_outputs_E  = new LinkedList<>();
        expected_outputs_E.add(a);
        expected_outputs_E.add(c);
        expected_outputs_E.add(b);
        expected_outputs_E.add(e);

        // get actual outputs (shortest path ) for each node from result
        LinkedList<Node> actual_outputs_A = result.get(0).getShortestPath();
        LinkedList<Node> actual_outputs_C = result.get(1).getShortestPath();
        LinkedList<Node> actual_outputs_B = result.get(2).getShortestPath();
        LinkedList<Node> actual_outputs_D = result.get(3).getShortestPath();
        LinkedList<Node> actual_outputs_E = result.get(4).getShortestPath();


        assertEquals(expected_outputs_A, actual_outputs_A);
        assertEquals(expected_outputs_B, actual_outputs_B);
        assertEquals(expected_outputs_C, actual_outputs_C);
        assertEquals(expected_outputs_D, actual_outputs_D);
        assertEquals(expected_outputs_E, actual_outputs_E);


    }
}