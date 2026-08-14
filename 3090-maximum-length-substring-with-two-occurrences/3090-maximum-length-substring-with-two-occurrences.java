class Solution {
    public int maximumLengthSubstring(String s) {
        int left=0;
        int max=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>2){
                char remove =s.charAt(left);
                map.put(remove,map.get(remove)-1);
                left++;
            }
            int length=i-left+1;
            max=Math.max(max,length);
        }
        return max;
    }
}