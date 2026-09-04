class Solution {
    public int firstStableIndex(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            int large=Integer.MIN_VALUE;
            for(int j=0;j<=i;j++){
                if(nums[j]>large){
                    large=nums[j];
                }
            }
            int small=Integer.MAX_VALUE;
            for(int ke=i;ke<nums.length;ke++){
                if(nums[ke]<small){
                    small=nums[ke];
                }
            }
            if((large-small)<=k){
                return i;
            }
        }
        return -1;
    }
}