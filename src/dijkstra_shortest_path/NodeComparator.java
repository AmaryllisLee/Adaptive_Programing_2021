package dijkstra_shortest_path;

import java.util.Comparator;

public class NodeComparator implements Comparator<Node> {


    @Override
    /**
     * Custom compare method to sort node based on distance in a Priority queue.
     * Return 0 if the two Node object are equal
     *        1 if s1 is greater than s2
     *       -1 if s1 is less than s2
     */
    public int compare(Node s1, Node s2) {
        // Custom compare method om node te sorteren op base van distance in een Priority queue
        if (s1.getAmount() > s2.getAmount()) {
            return 1;
        } else if (s1.getAmount() < s2.getAmount()) {
            return -1;
        } else {
            return 0;
        }
    }
}
