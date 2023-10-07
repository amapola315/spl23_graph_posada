package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;


public class Graph {
    private List<Node> nodes;

    public Graph() {
        this.nodes = new ArrayList<>();
    }

    public void addNode(String label) {
        nodes.add(new Node(label));
    }

    public void addEdge(String from, String to, int weight) {
        Node fromNode = getNode(from);
        Node toNode = getNode(to);

        if (fromNode == null || toNode == null)
            throw new IllegalArgumentException("Invalid node name");

        fromNode.addNeighbor(toNode, weight);
    }

    public Node getNode(String label) {
        for (Node node : nodes) {
            if (node.getLabel().equals(label)) {
                return node;
            }
        }
        return null;
    }
    
    public List<Node> getNodes() {
        return nodes;
    }
    
    public void depthFirstSearch() {
        Set<Node> visited = new HashSet<>();
        for (Node node : nodes) {
            if (!visited.contains(node)) {
                depthFirstSearch(node, visited); //recursive method
            }
        }
    }

    private void depthFirstSearch(Node node, Set<Node> visited) {
        visited.add(node);
        System.out.print(node.getLabel() + " ");

        for (Edge edge : node.getNeighbors()) {
            Node neighbor = edge.getDestination();
            if (!visited.contains(neighbor)) {
                depthFirstSearch(neighbor, visited);
            }
        }
    }
    
    public List<Edge> minimumSpanningTree() {
        List<Edge> mst = new ArrayList<>();
        Set<Node> visited = new HashSet<>();
        PriorityQueue<Edge> edgeQueue = new PriorityQueue<>(Comparator.comparingInt(Edge::getWeight));

        Node startNode = nodes.get(0);  // starting node arbitrarily
        visited.add(startNode);
        edgeQueue.addAll(startNode.getNeighbors());

        while (!edgeQueue.isEmpty()) {
            Edge edge = edgeQueue.poll();
            Node source = edge.getSource();
            Node destination = edge.getDestination();

            if (!(visited.contains(source) && visited.contains(destination))) {
                mst.add(edge);
                Node nextNode = visited.contains(source) ? destination : source;
                visited.add(nextNode);
                edgeQueue.addAll(nextNode.getNeighbors());
            }
        }

        return mst;
    }

    
}

