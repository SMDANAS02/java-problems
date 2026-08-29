class Solution {
    public int arrangeCoins(int n) {
        int coin=n;
        int answer=1;
        int count=0;
        while(coin>=answer){
            coin=coin-answer;
            answer++;
            count++;
        }
        return count;
    }
}