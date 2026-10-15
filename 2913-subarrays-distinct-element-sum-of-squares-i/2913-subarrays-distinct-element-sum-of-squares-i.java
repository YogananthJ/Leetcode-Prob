import java.util.*;

class Solution {
    public int sumCounts(List<Integer> nums) {
        int[] arr = nums.stream()
                        .mapToInt(Integer::intValue)
                        .toArray();
        int sum=0;
		
		for(int i=0;i<arr.length;i++){
		    
		    for(int j=i+1;j<=arr.length;j++){
		        HashSet<Integer> set = new HashSet<>();
		        int[] sub = Arrays.copyOfRange(arr, i,j);
		        for(int k:sub){
		        set.add(k);
		        }
		    
		        sum+=set.size()*set.size();
		    }
		    
		    
		}

        return sum;
    }
}