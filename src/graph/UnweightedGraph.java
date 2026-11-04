package graph;

import java.util.LinkedList;

public class UnweightedGraph<E> {
    private final int vertexCount;
    VertexList<E>[] adjacentList;

    public UnweightedGraph(E[] values) {
        this.vertexCount = values.length;
        this.adjacentList = new VertexList[values.length];

        for (int i = 0; i < values.length; i++) {
            adjacentList[i] = new VertexList<>(values[i]);
        }
    }

    public void addEdge(int source, int destination) {
        adjacentList[source].add(destination);
        adjacentList[destination].add(source);
    }

    public void addDirectedEdge(int source, int destination) {
        adjacentList[source].add(destination);
    }

    void print() {
        for (int i = 0; i < adjacentList.length; i++) {
            System.out.print(i + ":" + adjacentList[i].value + " -> ");
            for (Integer v : adjacentList[i].list) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }

    public void bfs(int start) {
        boolean[] visited = new boolean[vertexCount];
        LinkedList<Integer> queue = new LinkedList<>();

        for (int i = 0; i < vertexCount; i++) {
            visited[i] = false;
        }

        visited[start] = true;
        queue.add(start);

        System.out.print("BFS");

        while (!queue.isEmpty()) {
            int u = queue.poll();

            System.out.print("  ->  " + u + ":" + adjacentList[u].value);

            for (int v : adjacentList[u].list) {
                if (!visited[v]) {
                    visited[v] = true;
                    queue.add(v);
                }
            }
        }
    }

    void dfs(int start) {
        System.out.println();
        boolean[] visited = new boolean[vertexCount];
        System.out.print("DFS");
        dfsUtil(start, visited);
        System.out.println();
    }

    private void dfsUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print("  ->  " + v + ":" + adjacentList[v].value);
        for (int x : adjacentList[v].list) {
            if (!visited[x]) {
                dfsUtil(x, visited);
            }
        }
    }

    private static class VertexList<E> {
        E value;
        LinkedList<Integer> list;

        public VertexList(E value) {
            this.value = value;
            this.list = new LinkedList<>();
        }

        public void add(int destination) {
            list.add(destination);
        }
    }
}
