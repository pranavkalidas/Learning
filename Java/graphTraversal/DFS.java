package graphTraversal;

import java.util.Stack;

public class DFS {
    public static void main(String[] args) {
        int[][] graph = {
                {0,1,1,0,0,0,0},
                {0,0,0,1,0,0,1},
                {1,0,0,1,1,0,0},
                {0,1,1,0,1,1,0},
                {0,0,1,1,0,1,0},
                {0,0,0,1,1,0,0},
                {0,1,0,0,0,0,0}
        };
        dfsWithIteration(0, graph, new int[graph.length]);
        //dfsWithStack(0,graph);
    }

    private static void dfsWithStack(int vertex, int[][] graph) {
        int[] visited = new int[graph.length];
        visited[vertex]=1;
        Stack<Integer> stack = new Stack<>();
        stack.push(vertex);
        System.out.print(vertex+" -> ");

        while(!stack.empty()){
            vertex = stack.pop();
            //System.out.println(stack);
            for(int i=0; i<graph[vertex].length;++i){
                if(graph[vertex][i]==1 && visited[i]==0){
                    visited[i]=1;
                    System.out.print(i+" -> ");
                    stack.push(i);
                    //System.out.println(stack);
                    vertex=i;
                    i=0;
                }
            }
        }
    }

    private static void dfsWithIteration(int vertex, int[][] graph, int[] visited) {
        visited[vertex]=1;
        System.out.println(vertex+" -> ");
        for(int i=0; i<graph[vertex].length; ++i){
            if(graph[vertex][i]==1){
                if(visited[i]==0){
                    System.out.println("["+vertex+"]["+i+"]");
                    dfsWithIteration(i,graph,visited);
                    System.out.println("Traced back to: "+i);
                }
            }
        }
    }
}
