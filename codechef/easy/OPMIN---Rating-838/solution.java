class Solution {
    public int countNonMinimum(int[] nums) {
        int min = nums[0];

        // Minimum find 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > min) {
                count++;
            }
        }

        return count;
    }
}