class Solution {
    public String smallestPalindrome(String s) {
        if(s.length()==1){
            return s;
        }
        int []fre=new int[26];
            for(char ch:s.toCharArray()){
                fre[ch-'a']++;
            }
        StringBuilder left=new StringBuilder();
        String middle="";
        for(int i=0;i<26;i++){
            for(int j=0;j<fre[i]/2;j++){
                left.append((char) (i+'a'));
            }
            if(fre[i]%2==1){
                middle=String.valueOf((char) (i+'a'));
            }
        }
        String right=new StringBuilder(left).reverse().toString();
        return left.toString()+middle+right;
    }
}