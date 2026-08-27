class Solution {
    public boolean isPalindrome(int x) {

        if(x<0) return false;

        int num = x;
        int original = num;
        int reversed = 0; 

        while(num != 0) {
            int digit =  num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }
}