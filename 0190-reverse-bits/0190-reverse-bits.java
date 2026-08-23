class Solution {
    public int reverseBits(int n) {
    String bi=Integer.toBinaryString(n);
    bi=String.format("%32s",bi).replace(' ','0');
    String rev="";
    for(int i=bi.length()-1;i>=0;i--){
        rev+=bi.charAt(i);
    }
    long number = Long.parseUnsignedLong(rev, 2);
    return (int) number;
    }
}