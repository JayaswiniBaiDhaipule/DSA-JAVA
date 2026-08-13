class Solution {

     public int reverse(int n){
            int reverseNum = 0;
            while(n > 0){
            int rem = n % 10;
            reverseNum = reverseNum * 10 + rem;
            n /= 10;
            }
            return reverseNum;
        }

    public boolean isSameAfterReversals(int num) {
       return num == reverse(reverse(num));
    }
    
}