class Solution {
    public boolean isPalindrome(int x) {
        // Special cases:
        // 1. Negative numbers are not palindromes (due to the '-')
        // 2. Numbers ending in 0 (except 0 itself) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        // Keep reversing until the middle is reached
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + (x % 10);
            x /= 10;
        }

        // For even-length numbers: x == reversedHalf
        // For odd-length numbers: x == reversedHalf / 10 (removes the middle digit)
        return x == reversedHalf || x == reversedHalf / 10;
    }
}
