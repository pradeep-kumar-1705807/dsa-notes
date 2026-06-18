//compile: javac -d ../../build GraphUnDirectedEdgeList.java
//run: java -cp ../../build GraphUnDirectedEdgeList

import java.util.*;


class Pair {
    int u;
    int v;
    int weight;

    public Pair(int u, int v) {
        this.u = u;
        this.v = v;
        this.weight = 1; // default weight for unweighted graph
    }

    public Pair(int u, int v, int weight) {
        this.u = u;
        this.v = v;
        this.weight = weight;
    }
}
public class GraphUnDirectedEdgeList {

    Set<Pair> edgeList;
    public GraphUnDirectedEdgeList() {
        edgeList = new HashSet<>();
    }

    void addEdge(int u, int v) {
        edgeList.add(new Pair(u, v));
        edgeList.add(new Pair(v, u)); // for undirected graph
    }

    void addWeightedEdge(int u, int v, int weight) {
        edgeList.add(new Pair(u, v, weight));
        edgeList.add(new Pair(v, u, weight)); // for undirected graph
    }

    void removeEdge(int u, int v) {
        edgeList.remove(new Pair(u, v));
        edgeList.remove(new Pair(v, u)); // for undirected graph
    }
  
    void printGraph() {
        for (Pair edge : edgeList) {
            System.out.println(edge.u + " <-> " + edge.v + " (weight: " + edge.weight + ")");
        }
    }

    public static void main(String[] args) {
        GraphUnDirectedEdgeList graph = new GraphUnDirectedEdgeList();
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        graph.printGraph();
    }


}