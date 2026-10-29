
import java.util.*;

class Solution {
    public List<Boolean> palindromePath(int n, int[][] edges,
                                        String s, String[] queries) {

        List<Integer>[] adj = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            adj[e[0]].add(e[1]);
            adj[e[1]].add(e[0]);
        }

        int LOG = 1;
        while ((1 << LOG) <= n) {
            LOG++;
        }

        int[] parent = new int[n];
        int[] depth = new int[n];
        int[] tin = new int[n];
        int[] tout = new int[n];
        int[][] up = new int[n][LOG];

        // Iterative DFS
        int[] stack = new int[n];
        int[] next = new int[n];
        int top = 0;
        int timer = 0;

        stack[top++] = 0;
        parent[0] = 0;
        tin[0] = timer++;

        while (top > 0) {
            int u = stack[top - 1];

            if (next[u] < adj[u].size()) {
                int v = adj[u].get(next[u]++);

                if (v == parent[u]) {
                    continue;
                }

                parent[v] = u;
                depth[v] = depth[u] + 1;
                tin[v] = timer++;

                stack[top++] = v;
            } else {
                tout[u] = timer;
                top--;
            }
        }

        // Binary lifting table
        for (int i = 0; i < n; i++) {
            up[i][0] = parent[i];
        }

        for (int j = 1; j < LOG; j++) {
            for (int i = 0; i < n; i++) {
                up[i][j] = up[up[i][j - 1]][j - 1];
            }
        }

        char[] chars = s.toCharArray();
        int[] bit = new int[n + 2];

        // Initialize root-to-node XOR masks.
        for (int i = 0; i < n; i++) {
            int mask = 1 << (chars[i] - 'a');

            update(bit, n, tin[i] + 1, mask);
            update(bit, n, tout[i] + 1, mask);
        }

        List<Boolean> answer = new ArrayList<>();

        for (String query : queries) {
            String[] p = query.split(" ");

            if (p[0].equals("update")) {
                int u = Integer.parseInt(p[1]);
                char c = p[2].charAt(0);

                int oldMask = 1 << (chars[u] - 'a');
                int newMask = 1 << (c - 'a');

                int change = oldMask ^ newMask;

                // Update all root paths passing through u.
                update(bit, n, tin[u] + 1, change);
                update(bit, n, tout[u] + 1, change);

                chars[u] = c;

            } else {
                int u = Integer.parseInt(p[1]);
                int v = Integer.parseInt(p[2]);

                int lca = findLCA(
                    u, v, depth, parent, up, LOG
                );

                // XOR masks from root to each node.
                int maskU = prefix(bit, tin[u] + 1);
                int maskV = prefix(bit, tin[v] + 1);

                // Correct path XOR formula.
                int pathMask = maskU ^ maskV
                             ^ (1 << (chars[lca] - 'a'));

                // At most one character has an odd frequency.
                answer.add((pathMask & (pathMask - 1)) == 0);
            }
        }

        return answer;
    }

    static void update(int[] bit, int n, int index, int value) {
        while (index <= n + 1) {
            bit[index] ^= value;
            index += index & -index;
        }
    }

    static int prefix(int[] bit, int index) {
        int result = 0;

        while (index > 0) {
            result ^= bit[index];
            index -= index & -index;
        }

        return result;
    }

    static int findLCA(int u, int v, int[] depth,
                       int[] parent, int[][] up, int LOG) {

        if (depth[u] < depth[v]) {
            int temp = u;
            u = v;
            v = temp;
        }

        int diff = depth[u] - depth[v];

        for (int j = 0; j < LOG; j++) {
            if ((diff & (1 << j)) != 0) {
                u = up[u][j];
            }
        }

        if (u == v) {
            return u;
        }

        for (int j = LOG - 1; j >= 0; j--) {
            if (up[u][j] != up[v][j]) {
                u = up[u][j];
                v = up[v][j];
            }
        }

        return parent[u];
    }
}
