package matrixTraversal;

import java.util.Stack;

public class DFS {
    public static void main(String[] args) {
        int[][] graph = {
                {0,1,1,0,0,0,0},
                {0,0,1,1,0,0,1},
                {1,0,0,1,1,0,0},
                {0,1,1,0,1,0,0},
                {0,0,1,1,1,1,0},
                {0,0,1,0,0,0,0},
                {0,1,0,0,0,0,0}
        };

        helper(graph);
    }

    private static void helper(int[][] graph) {
        int[][] visited = new int[graph.length][graph[0].length];
        for(int i=0; i<graph.length; ++i) {
            for (int j = 0; j < graph[0].length; ++j) {
                if (graph[i][j] == 1 && visited[i][j]!=1) {
                    dfsTraversal(graph,i,j,visited);
                }
            }
        }
        for(int[] a : graph){
            for(int b : a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }

    private static void dfsTraversal(int[][] graph, int i, int j, int[][] visited){
        visited[i][j]=1;
        if(i+1<graph.length && graph[i+1][j]==1 && visited[i+1][j]!=1){
            dfsTraversal(graph,i+1,j,visited);
            graph[i+1][j]=8;
        }
        if(j+1<graph[0].length && graph[i][j+1]==1 && visited[i][j+1]!=1){
            dfsTraversal(graph,i,j+1,visited);
            graph[i][j+1]=8;
        }
        if(i-1>=0 && graph[i-1][j]==1 && visited[i-1][j]!=1){
            dfsTraversal(graph,i-1,j,visited);
            graph[i-1][j]=8;
        }
        if(j-1>=0 && graph[i][j-1]==1 && visited[i][j-1]!=1){
            dfsTraversal(graph,i,j-1,visited);
            graph[i][j-1]=8;
        }
        graph[i][j]=8;
        for(int[] a : graph){
            for(int b : a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
