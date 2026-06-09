class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int max=nums[0];
        int min=nums[0];
        for(int num:nums){
            max=Math.max(num,max);
          min=Math.min(num,min);
        }
          return (long)k*(max-min);
        }
}