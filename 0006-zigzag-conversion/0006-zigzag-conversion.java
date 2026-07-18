class Solution {
    public String convert(String s, int numRows) {
        if(s.length()>=numRows && numRows==1 ){
            return s;
        }
        StringBuilder row[]=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            row[i]=new StringBuilder();
        }
        int in=0;
        int st=0;
        for(char c:s.toCharArray()){
            row[in].append(c);
            if(in==0) st=1;
            else if(in == numRows-1) st=-1;
            in+=st;
        }
        StringBuilder res=new StringBuilder();
        for(StringBuilder c:row){
            res.append(c);
        }
        return res.toString();
    }
}