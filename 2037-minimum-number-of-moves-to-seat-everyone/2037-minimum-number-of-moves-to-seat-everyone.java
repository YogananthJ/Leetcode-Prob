class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int sum = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i=0;i<seats.length;i++){
            int d = seats[i]-students[i];
            sum+=Math.abs(d);
        }
        return sum;
    }
}