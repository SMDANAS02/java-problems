class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[]=new int[2];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    arr[0]=nums[i];
                }
            }
        }
        int expected=nums.length*(nums.length+1)/2;
        arr[1]=arr[0]+expected-sum;
        return arr;

        
    }
}