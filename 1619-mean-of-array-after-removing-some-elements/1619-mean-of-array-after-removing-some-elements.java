class Solution {
    public double trimMean(int[] arr) {
        int a = (int) (arr.length * 0.05);
        int b = (arr.length - a) - 1;

        Arrays.sort(arr);

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i >= a && i <= b) {
                list.add(arr[i]);
            }
        }

        int sum = 0;
        for (int i : list) {
            sum += i;
        }

        return (double) sum / list.size();
    }
}
