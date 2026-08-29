class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Find total sum of all elements
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {

            // Sum of differences with elements on the left
            int left = nums[i] * i - leftSum;

            // Sum of elements on the right
            int rightSum = totalSum - leftSum - nums[i];

            // Sum of differences with elements on the right
            int right = rightSum - nums[i] * (n - i - 1);

            result[i] = left + right;

            // Add current element to left sum
            leftSum += nums[i];
        }

        return result;
    }
}
