class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int arr[]=new int[nums.length];
        int ind=0;
        for(int num:nums){
            if(num%2==0){
                arr[ind++]=num;
            }
        }
        for(int num:nums){
            if(num%2!=0){
                arr[ind++]=num;
            }
        }
        return arr;
    }
}