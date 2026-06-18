//Compile: javac -d ../../build GraphUnDirectedAdjacencyList.java
//Run: java -cp ../../build GraphUnDirectedAdjacencyList
import java.util.*;

public class GraphUnDirectedAdjacencyList {
    /***
     *   1-2 , 3-4 ,2-5 is connected graph
     *  then representation of graph is like below
     *  1-> 2
     *  2-> 1,5
     *  3-> 4
     *  4-> 3
     *  5-> 2
     */


    private final int vertices;
    private final LinkedList<Integer>[] adjacencyList;

    public GraphUnDirectedAdjacencyList(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    void addEdge(int u, int v) {
        adjacencyList[u].add(v);
        adjacencyList[v].add(u);
    }

    void removeEdge(int u, int v) {
        adjacencyList[u].remove(Integer.valueOf(v));
        adjacencyList[v].remove(Integer.valueOf(u));
    }


    // O(V) in worst case we can use hashset to reduce it to O(1)
    boolean hasEdge(int u, int v) {
        return adjacencyList[u].contains(v);
    }

    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            for (Integer neighbor : adjacencyList[i]) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        GraphUnDirectedAdjacencyList graph = new GraphUnDirectedAdjacencyList(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        graph.printGraph();
    }
}