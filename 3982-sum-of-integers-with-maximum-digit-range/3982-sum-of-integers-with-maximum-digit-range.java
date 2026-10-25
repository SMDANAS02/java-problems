class Solution {
    public int maxDigitRange(int[] nums) {
        int arr[]=new int[nums.length];
        int maxrange=0;
       for(int i=0;i<nums.length;i++){
        int n=nums[i];
        int max=0;
        int min=9;
        while(n>0){
            int d=n%10;
             if(d>max){
                max=d;
             }
             if(d<min){
               min=d;
             }
             n/=10;
        }
        int m=max-min;
        arr[i]=m;
        maxrange=Math.max(maxrange,m);
       } 
       int sum=0;
       for(int i=0;i<nums.length;i++){
        if(arr[i]==maxrange){
            sum+=nums[i];
        }
       }
       return sum;
    }
}