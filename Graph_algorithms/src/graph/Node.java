package graph;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String label;
    private List<Edge> neighbors;
    private boolean isDirected;

    public Node(String label, boolean isDirected) {
        this.label = label;
        this.neighbors = new ArrayList<>();
        this.isDirected = isDirected;
    }

    public String getLabel() {
        return label;
    }

    public void addNeighbor(Node neighbor, int weight) {
    	 if (isDirected) {
             Edge edge = new Edge(this, neighbor, weight, true);
             neighbors.add(edge);
         } else {
             Edge edge = new Edge(this, neighbor, weight, false);
             neighbors.add(edge);
             // Para un grafo no dirigido arista inversa
             Edge reverseEdge = new Edge(neighbor, this, weight, false);
             neighbor.neighbors.add(reverseEdge);
         }
    }

    public List<Edge> getNeighbors() {
        return neighbors;
    }

    @Override
    public String toString() {
        return label;
    }
}
