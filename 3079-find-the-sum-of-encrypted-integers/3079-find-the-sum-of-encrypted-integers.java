class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int temp=n;
            int max=0;
            while(temp>0){
                int d=temp%10;
                if(d>max){
                    max=d;
                }
                temp/=10;
            }
            int encrpt=0;
            while(n>0){
                encrpt=encrpt*10+max;
                n/=10;
            }
            arr[i]=encrpt;
        }
        for(int i=0;i<nums.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}