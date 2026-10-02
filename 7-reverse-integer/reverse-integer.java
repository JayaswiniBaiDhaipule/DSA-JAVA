class Solution {
    public int reverse(int x) {
        int reverseNum = 0;
        while(x != 0){
            int ld = x % 10;
            if(reverseNum > Integer.MAX_VALUE / 10 || reverseNum == Integer.MAX_VALUE / 10 && ld > 7){
                return 0;
                }


            if(reverseNum < Integer.MIN_VALUE / 10 || reverseNum == Integer.MIN_VALUE / 10 && ld < -8 ){
            return 0;
            }
            
            reverseNum = reverseNum * 10 + ld;
            x /= 10;
        }
        return reverseNum;
    }
}