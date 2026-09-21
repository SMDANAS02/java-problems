class Solution {
    public String convertDateToBinary(String date) {
        String []str=date.split("-");
        int year=Integer.parseInt(str[0]);
        int month=Integer.parseInt(str[1]);
        int day=Integer.parseInt(str[2]);
        String ans=Integer.toBinaryString(year)+"-"+Integer.toBinaryString(month)+"-"+Integer.toBinaryString(day);
        return ans;
    }
}