import java.util.Arrays;

class Solution {
    public String largestNumber(int[] nums) {
        // Convert integers to strings for custom sorting
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }
        
        // Sort strings using the custom comparator
        Arrays.sort(strNums, (a, b) -> {
            String order1 = a + b;
            String order2 = b + a;
            // Compare in descending order
            return order2.compareTo(order1); 
        });
        
        // If the largest number after sorting is "0", the entire number is zero
        if (strNums[0].equals("0")) {
            return "0";
        }
        
        // Append the sorted strings to form the largest number
        StringBuilder largestNumberStr = new StringBuilder();
        for (String numAsStr : strNums) {
            largestNumberStr.append(numAsStr);
        }
        
        return largestNumberStr.toString();
    }
}