class Solution {
    public String sortVowels(String s) {
       List<Character> list=new ArrayList<>();
       for(char c:s.toCharArray()){
        if("aeiouAEIOU".indexOf(c)!=-1){
            list.add(c);
        }
       } 
       Collections.sort(list);
       int j=0;
       char []arr=s.toCharArray();
       for(int i=0;i<s.length();i++){
        if("aeiouAEIOU".indexOf(arr[i])!=-1){
            arr[i]=list.get(j++);
        }
       }
       return new String(arr);
    }
}