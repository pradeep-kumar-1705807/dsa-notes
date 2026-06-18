public class GraphMatrixUnDirected {

    int[][] graph;

    void addEdge(int u, int v) {
        graph[u][v] = 1;
        graph[v][u] = 1;
    }

    void removeEdge(int u, int v) {
        graph[u][v] = 0;
        graph[v][u] = 0;
    }

    boolean hasEdge(int u, int v) {
        return graph[u][v] == 1;
    }


    public GraphMatrixUnDirected(int vertices) {
        graph = new int[vertices][vertices];
    }

    public void printGraph() {
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                System.out.print( graph[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphMatrixUnDirected graph = new GraphMatrixUnDirected(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        graph.printGraph();
    }

}