class Solution {
    public int countSeniors(String[] details) {
        return (int) Arrays.stream(details)
    .filter(d -> Integer.parseInt(d.substring(11, 13)) > 60)
    .count();
    }
}