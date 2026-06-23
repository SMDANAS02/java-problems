class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int window=sum;
        for(int i=k;i<nums.length;i++){
            window+=nums[i]-nums[i-k];
            sum=Math.max(sum,window);
        }
        return (double)sum/k;
    }
}