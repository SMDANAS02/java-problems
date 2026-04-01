class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int arr[]=new int[code.length];
        if(k==0){
            for(int i=0;i<n;i++){
                arr[i]=0;
            }
        }
        else if(k>0){
            for(int i=0;i<code.length;i++){
                int sum=0;
                for(int j=1;j<=k;j++){
                    int index=(i+j) % n;
                    sum+=code[index];
                }
                arr[i]=sum;
            }
        }
        else if(k<0){
             k=Math.abs(k);
            for(int i=0;i<n;i++){
                int sum=0;
                for(int j=1;j<=k;j++){
                    int index =(i-j+n) % n;
                    sum+=code[index];
                }
                arr[i]=sum;
            }

        }
        return arr;
    }
}