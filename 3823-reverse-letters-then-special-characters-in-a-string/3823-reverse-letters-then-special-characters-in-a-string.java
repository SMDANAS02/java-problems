class Solution {
    public String reverseByType(String s) {
       StringBuilder letter=new StringBuilder();
       StringBuilder special=new StringBuilder();
       for(char c:s.toCharArray()){
        if(Character.isLetter(c))letter.append(c);
        else{
            special.append(c);
        }
       }
       letter.reverse();
       special.reverse();
       StringBuilder res=new StringBuilder();
       int l = 0;
        int sp = 0;
       for(char c:s.toCharArray()){
        if(Character.isLetter(c))res.append(letter.charAt(l++));
        else{
            res.append(special.charAt(sp++));
        }
       }
        return new String(res);
       }
      
       
    }
