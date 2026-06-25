class Solution {
    public int minOperations(int[] nums) {
      int n=nums.length;
      int count=0;
      for(int i=0;i<n-2;i++){
        boolean t=false;
        for(int k=i;k<3+i;k++){
            if(nums[k]==1 && !t) break;
            if(nums[k]==0)nums[k]=1;
            else nums[k]=0;
            t=true;
            
        }
        if(t)count++;
      }
      for(int i:nums){
        if(i==0)return -1;
      }

      return count;
    }
}