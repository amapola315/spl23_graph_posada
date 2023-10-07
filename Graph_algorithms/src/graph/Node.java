package graph;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String label;
    private List<Edge> neighbors;

    public Node(String label) {
        this.label = label;
        this.neighbors = new ArrayList<>();
    }

    public String getLabel() {
        return label;
    }

    public void addNeighbor(Node neighbor, int weight) {
        Edge edge = new Edge(this, neighbor, weight);
        neighbors.add(edge);
    }

    public List<Edge> getNeighbors() {
        return neighbors;
    }

    @Override
    public String toString() {
        return label;
    }
}
