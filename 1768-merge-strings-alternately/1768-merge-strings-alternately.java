class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length()+word2.length();
        char []a=new char[n];
        int j=0;
        int k=0;
       for(int i=0;i<word1.length() || j<word2.length();){
        if(i<word1.length()){
            a[k++]=word1.charAt(i);
            i++;
        }
        if(j<word2.length()){
            a[k++]=word2.charAt(j);
            j++;
        }
       }
        return new String(a);
    }
    }