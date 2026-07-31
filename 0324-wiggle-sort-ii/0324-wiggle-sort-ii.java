class Solution {
    public void wiggleSort(int[] nums) {
       int arr[]=nums.clone();
       int n=nums.length;
       int left=(n-1)/2;
       int right=n-1;
       Arrays.sort(arr);
       for(int i=0;i<n;i++){
        if(i%2==0)
        {
            nums[i]=arr[left--];
        }
        else{
        nums[i]=arr[right--];}
       }
   }
}