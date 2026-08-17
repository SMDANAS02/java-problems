class Solution {
    public int findDuplicate(int[] nums) {
     HashSet<Integer>set=new HashSet<>();
     for(int arr:nums){
        if(!set.contains(arr)){
            set.add(arr);
        }
        else{
            return arr;
        }
     }
     return -1;
    }
}