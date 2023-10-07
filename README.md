# spl23_graph_posada
A labeled, weighted graph data structure in Java with Eclipse.

# Graph Algorithms Program

This program allows you to create a graph and apply the Depth First Search (DFS) and Minimum Spanning Tree (MST) algorithms. 
The program has a command line interface CLI and handles directed graphs, where each edge represents a one-way connection from a source node to a destination node.

## Example of input and output

- **Data input:**

    ```plaintext
---Input data for a directed graph structure---
Enter number of nodes: 2
enter for node (1) a name: a
enter for node (2) a name: b
Enter number of edges: 2
Enter connection for edge 1:
from node: a
---> to node: b
enter weight: 3
Enter connection for edge 2:
from node: b
---> to node: a
enter weight: 5
    ```

- **output (Graph structure):**

    ```plaintext
  Node a --> b (3) | 
  Node b --> a (5) | 
    ```

- **output (DFS):**

    ```plaintext
    Depth First Search (DFS):
    A B C
    ```

- **output (MST):**

    ```plaintext
    Minimum Spanning Tree (MST):
    A --5--> B
    B --1--> C
    ```

---



