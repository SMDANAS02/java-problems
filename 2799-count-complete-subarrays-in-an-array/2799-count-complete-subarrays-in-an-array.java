class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int totaldistinct=set.size();
        return atmost(nums,totaldistinct)-atmost(nums,totaldistinct-1);
        
    }
    static int atmost(int nums[],int k){
        Map<Integer,Integer> map=new HashMap<>();
        int left=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(map.size()>k){
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;
            }
            ans+=i-left+1;
        }
        return ans;
    }
}