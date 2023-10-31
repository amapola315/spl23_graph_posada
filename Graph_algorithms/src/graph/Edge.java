package graph;

public class Edge {
    private Node source;
    private Node destination;
    private int weight;
    private boolean isDirected; 

    public Edge(Node source, Node destination, int weight, boolean isDirected) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
        this.isDirected = isDirected;
    }

    public Node getSource() {
        return source;
    }

    public Node getDestination() {
        return destination;
    }

    public int getWeight() {
        return weight;
    }
    
    public boolean isDirected() {
        return isDirected;
    }

    @Override
    public String toString() {
        if (isDirected) {
            return source.getLabel() + " --" + weight + "--> " + destination.getLabel();
        } else {
            return source.getLabel() + " --" + weight + "-- " + destination.getLabel();
        }

    }
}
