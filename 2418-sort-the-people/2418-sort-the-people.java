class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        // Create a map to store the height as the key and the name as the value
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        
        // Sort the heights array in ascending order
        Arrays.sort(heights);
        
        // Create a result array and populate it by iterating the sorted heights backwards (descending)
        String[] result = new String[names.length];
        int index = 0;
        for (int i = heights.length - 1; i >= 0; i--) {
            result[index++] = map.get(heights[i]);
        }
        
        return result;
    }
}