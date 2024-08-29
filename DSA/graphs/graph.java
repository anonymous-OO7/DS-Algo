package graphs;

import java.util.ArrayList;
import java.util.List;

public class graph {

    public static void addEdge(int[][] mat, int i, int j) {
        mat[i][j] = 1;
        mat[j][i] = 1;
    }

    public static void displayMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\n");
        }

    }

    // functions of adjacency list

    public static void addEdgeAdjList(List<List<Integer>> adj, int i, int j) {
        adj.get(i).add(j);
        adj.get(j).add(i);
    }

    public static void displayAdjacencyListGraph(List<List<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.err.print(adj.get(i).get(j));
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello This is graph fiel");

        // using adjacency matrix
        int v = 4;
        int[][] adjMatrix = new int[v][v];
        List<List<Integer>> adj = new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        addEdge(adjMatrix, 0, 1);
        addEdge(adjMatrix, 1, 2);
        addEdge(adjMatrix, 0, 2);
        System.out.println("Displaying the created matrix graph");
        displayMatrix(adjMatrix);

        // using adjacency list

        addEdgeAdjList(adj, 0, 1);
        addEdgeAdjList(adj, 1, 2);
        addEdgeAdjList(adj, 0, 2);
        System.out.println("Displaying the created adjacency list graph");

        displayAdjacencyListGraph(adj);
    }
}
