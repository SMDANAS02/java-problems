class Solution {
    public int thirdMax(int[] nums) {
       Set<Integer> se=new HashSet<>();
       for(int i=0;i<nums.length;i++){
        se.add(nums[i]);
       }
       List<Integer> list = new ArrayList<>(se);

       Collections.sort(list);
       if(list.size()<3){
        return list.get(list.size() -1);
       } 
       return list.get(list.size() - 3);
    }
}