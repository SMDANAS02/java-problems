class Solution {
    public int romanToInt(String s) {
        int sum=0;
     for(int i=0;i<s.length();i++){
       int current=getvalue(s.charAt(i));
       if(i+1<s.length()){
        int next=getvalue(s.charAt(i+1));
        if(current <next){
            sum-=current;
        }
        else{
            sum+=current;
        }
       }
       else{
        sum+=current;
       }
        
     }
      return sum;
    }
    public int getvalue(char c){
        if(c=='I')return 1;
        else if(c=='V') return 5;
        else if(c=='X') return 10;
        else if(c=='L') return 50;
        else if(c=='C') return 100;
        else if(c=='D') return 500;
        else{
            return 1000;
        }
    }
}