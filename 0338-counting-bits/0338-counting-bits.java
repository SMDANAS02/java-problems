class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        int i=0;
        while(i<=n){
               int count=0;
               int t=i;
               while(t>0){
                count+=(t & 1);
                t=t>>1;
               }
              arr[i]=count;
              i++; 
        }
        return arr;
    }
}