class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder se=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='-'){
                se.append(Character.toUpperCase(s.charAt(i)));
            }

        }
         if (se.length() == 0) {
            return "";
        }
        int frist=se.length()%k;
        if(frist==0){
            frist=k;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<frist;i++){
          sb.append(se.charAt(i));
        }
        for(int i=frist;i<se.length();i+=k){
            sb.append("-");
            for(int j=i;j<i+k;j++){
                sb.append(se.charAt(j));
            }
        }
        return sb.toString();

    }
}