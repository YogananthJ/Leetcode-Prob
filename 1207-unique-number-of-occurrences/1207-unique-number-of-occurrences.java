class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int n : arr) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        Set<Integer> set = new HashSet<>();
        for(int i:freq.values()){
            set.add(i);
        }
        if(set.size()==freq.size()) return true;
        return false;
    }
}