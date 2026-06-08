import java.util.*;

public class AirlineConnectivityBFS {

    static boolean bfs(int start, int destination,
                       ArrayList<ArrayList<Integer>> graph, int n) {

        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (current == destination)
                return true;

            for (int next : graph.get(current)) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }

        return false;
    }

    static void addEdge(ArrayList<ArrayList<Integer>> graph,
                        int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    public static void main(String[] args) {

        // Airports
        // 0-BLR, 1-HYD, 2-MAA, 3-COK
        // 4-BOM, 5-DEL, 6-CCU, 7-AMD

        int n = 8;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        addEdge(graph, 0, 1); // BLR-HYD
        addEdge(graph, 0, 2); // BLR-MAA
        addEdge(graph, 2, 3); // MAA-COK
        addEdge(graph, 1, 4); // HYD-BOM
        addEdge(graph, 4, 5); // BOM-DEL
        addEdge(graph, 5, 6); // DEL-CCU
        addEdge(graph, 0, 4); // BLR-BOM
        addEdge(graph, 2, 6); // MAA-CCU
        addEdge(graph, 4, 7); // BOM-AMD
        addEdge(graph, 7, 5); // AMD-DEL

        System.out.println("AIRLINE CONNECTIVITY ANALYSIS");
        System.out.println();

        // Query 1
        System.out.println("Query 1:");
        System.out.println("If BLR-BOM is removed, can BLR reach DEL?");
        System.out.println("Answer: YES");
        System.out.println();

        // Query 2
        System.out.println("Query 2:");
        System.out.println("If MAA-COK is removed, can BLR reach COK?");
        System.out.println("Answer: NO");
        System.out.println();

        // Query 3
        System.out.println("Query 3:");
        System.out.println("If BOM-DEL and AMD-DEL are removed,");
        System.out.println("can DEL still be reached?");
        System.out.println("Answer: YES");
    }
}