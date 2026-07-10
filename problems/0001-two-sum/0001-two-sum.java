class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int index = 0; index < (nums.length-1); index ++) {
            int initial = nums[index];
            for (int i = (index + 1); i < nums.length; i++) {
                int second = nums[i];
                int sum = initial + second;
                if (sum == target) {
                    result[0] = index;
                    result[1] = i;
                    return result;
                }
            }
        }

        return result;
    }
}