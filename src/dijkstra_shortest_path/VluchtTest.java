package dijkstra_shortest_path;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VluchtTest {

    @Test
    /**
     * Test getValue method for Vlucht with distance of cost and probablity of losingg a luggage.
     */
    void getValue() {
        Node a = new Node("a");
        Node b = new Node("b");

        Stap test = new Vlucht(a, b, 10, .2);

        assertTrue(test.getValue() == 12);
    }
}