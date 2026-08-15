class Solution {
    public String arrangeWords(String text) {
        String[] arr = text.split(" ");
        Arrays.sort(arr, Comparator.comparingInt(String::length));
        String s = String.join(" ",arr);
        s = Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
        return s;
    }
}