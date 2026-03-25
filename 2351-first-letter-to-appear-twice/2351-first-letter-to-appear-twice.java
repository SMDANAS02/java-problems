class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character,Integer> mapp=new HashMap<>();
         for(int i=0;i<s.length();i++){
            mapp.put(s.charAt(i),mapp.getOrDefault(s.charAt(i),0)+1);
            if(mapp.get(s.charAt(i))==2){
                return s.charAt(i);
            }
         }
      return ' ';   
    }
}