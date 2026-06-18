class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
     int arr[]=new int[m+n];
    // for(int i=0;i<m;i++){
    //     arr[i]=nums1[i];
    // }
    // for(int i=0;i<n;i++){
    //     arr[i+m]=nums2[i];
    // }
    // int i=0;
    // int j=arr.length-1;
    // int c=arr.length-1;
    // while(i<=j){
    //     if(arr[i]>arr[j]){
    //         nums1[c]=arr[i];
    //         i++;

    //     }
    //     else{
    //         nums1[c]=arr[j];
    //         j--;
    //     }
    //     c--;
        
    // }
    for(int i=0;i<nums1.length;i++){
        arr[i]=nums1[i];
    }
    for(int i=0;i<nums2.length;i++){
        arr[m+i]=nums2[i];
    }
    Arrays.sort(arr);
    for(int i=0;i<m+n;i++){
        nums1[i]=arr[i];
    }
    }
}
