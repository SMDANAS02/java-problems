class Solution {
    public String largestOddNumber(String num) {
        char []a=num.toCharArray();
       for(int i=a.length-1;i>=0;i--){
        if((a[i]-'0')%2!=0){
            return num.substring(0,i+1);
        }
       }
       return "";
    }
}