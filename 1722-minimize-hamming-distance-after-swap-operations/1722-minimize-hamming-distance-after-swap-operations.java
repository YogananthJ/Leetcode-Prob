import java.util.*;

class Solution {
    public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
        int r = 0;
        int n = source.length;

        // Step 1: Union-Find
        UnionFind uf = new UnionFind(n);
        for (int i = 0; i < allowedSwaps.length; i++) {
            uf.union(allowedSwaps[i][0], allowedSwaps[i][1]);
        }

        // Step 2: group indices
        Map<Integer, List<Integer>> groups = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int parent = uf.find(i);
            groups.computeIfAbsent(parent, k -> new ArrayList<>()).add(i);
        }

        // Step 3: process each group
        for (List<Integer> group : groups.values()) {

            // instead of Set s → use frequency map
            Map<Integer, Integer> s = new HashMap<>();

            // count source values
            for (int i : group) {
                s.put(source[i], s.getOrDefault(source[i], 0) + 1);
            }

            // match with target
            for (int i : group) {
                if (s.getOrDefault(target[i], 0) > 0) {
                    s.put(target[i], s.get(target[i]) - 1);
                } else {
                    r++;
                }
            }
        }

        return r;
    }
}


// same helper
class UnionFind {
    int[] parent;

    public UnionFind(int n) {
        parent = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;
    }

    public int find(int x) {
        if (parent[x] != x)
            parent[x] = find(parent[x]);
        return parent[x];
    }

    public void union(int a, int b) {
        int pa = find(a);
        int pb = find(b);
        if (pa != pb) parent[pa] = pb;
    }
}