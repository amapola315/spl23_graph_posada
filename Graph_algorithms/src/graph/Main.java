//Solution Exercise 1 – SPL Introduction and Runtime Parameter 
//Student: Ana Posada

package graph;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Graph graph = new Graph();

        // enter the number of nodes
        System.out.print("---Input data for a directed graph structure---\n");
        System.out.print("Enter number of nodes: ");
        int numNodes = scanner.nextInt();

        // add nodes
        for (int i = 0; i < numNodes; i++) {
            System.out.print("enter for node (" + (i + 1) + ") a name: ");
            String label = scanner.next();
            graph.addNode(label);
        }

        // enter total of edges
        System.out.print("Enter number of edges: ");
        int numEdges = scanner.nextInt();

        // adding edges
        for (int i = 0; i < numEdges; i++) {
            System.out.println("Enter connection for edge " + (i + 1) + ":");
            System.out.print("from node: ");
            String from = scanner.next();
            System.out.print("---> to node: ");
            String to = scanner.next();
            System.out.print("enter weight: ");
            int weight = scanner.nextInt();
            graph.addEdge(from, to, weight);
        }

        // show graph structure
        System.out.println("------------");
        System.out.println("Graph structure");
        for (Node node : graph.getNodes()) {
            System.out.print("Node " + node.getLabel() + " --> ");
            for (Edge edge : node.getNeighbors()) {
                System.out.print(edge.getDestination().getLabel() + " (" + edge.getWeight() + ") | ");
            }
            System.out.println();
        }

     // Depth First Search (DFS)
        System.out.println("------------");
        System.out.println("Depth First Search (DFS)");
        graph.depthFirstSearch();
        System.out.println();  // Agrega un salto de línea después de imprimir los nodos visitados

        // Minimum Spanning Tree (MST)
        System.out.println("------------");
        System.out.println("Minimum Spanning Tree (MST)");
        for (Edge edge : graph.minimumSpanningTree()) {
            System.out.println(edge);
        }

        
        scanner.close();
    }
}
