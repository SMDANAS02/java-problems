class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        String[] phone={",",",","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(digits.length()==0){
            return result;
        }
        bt(digits,phone,0,"",result);
        return result;

    }
    public static void bt(String digit,String[]phone,int index,String temp,List<String> result){
       if(index==digit.length()){
        result.add(temp);
        return;
       }
       int num=digit.charAt(index)-'0';
       String let=phone[num];
       for(int i=0;i<let.length();i++){
        char ch=let.charAt(i);
       bt(digit,phone,index+1,temp+ch,result);
       }
       
    }
}