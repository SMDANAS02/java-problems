class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int arr[]=new int[A.length];

       for(int k=0;k<A.length;k++){
         int count=0;
          for(int i=0;i<=k;i++){
            for(int j=0;j<=k;j++){
                if(A[i]==B[j])count++;
            }
           }
           arr[k]=count;
       }
        
        return arr;
    }
}