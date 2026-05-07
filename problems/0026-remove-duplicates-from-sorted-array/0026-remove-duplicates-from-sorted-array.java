class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> uniqueNums = new ArrayList();
        for(int i = 0; i < nums.length; i++) {
            if(!uniqueNums.contains(nums[i])) {
                uniqueNums.add(nums[i]);
            }
        }
        for(int j = 0; j < uniqueNums.size(); j++) {
            nums[j] = uniqueNums.get(j);
        }
        return uniqueNums.size();
    }
}