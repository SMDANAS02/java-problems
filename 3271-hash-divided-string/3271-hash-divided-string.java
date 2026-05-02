class Solution {
    public String stringHash(String s, int k) {
      StringBuilder se=new StringBuilder();
        for(int i=0;i<s.length();i+=k){
               int sum=0;
               for(int j=i;j<i+k;j++){
                int index=s.charAt(j)-'a';
                sum+=index;
               }
               int value=sum%26;
               char re=(char) ('a'+ value);
               se.append(re);
        }
        return se.toString();
    }
}