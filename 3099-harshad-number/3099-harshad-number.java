class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int temp=x;
        while(temp>0){
            int did=temp%10;
            sum+=did;
            temp/=10;
        }
        if(x%sum==0)return sum;
        return -1;
    }
}