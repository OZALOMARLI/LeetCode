// 9. Palindrome Number

class Solution9 {
    public boolean isPalindrome(int x) {
        if (x<0 || (x%10 == 0 && x!=0)) 
        {
            return false;
        }

        int reversedHalf=0;

        while (x>reversedHalf)
        {
            int number = x % 10;
            reversedHalf = reversedHalf *10 + number;
            x /= 10;
        }
            return x == reversedHalf || x == reversedHalf /10;
    }
}