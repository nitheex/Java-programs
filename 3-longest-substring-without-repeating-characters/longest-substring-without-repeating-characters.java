import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        // Map to store the last seen index of each character
        HashMap<Character, Integer> map = new HashMap<>();

        // 'left' is the start of the current sliding window
        for (int right = 0, left = 0; right < n; right++) {
            char c = s.charAt(right);

            // If we've seen this character before, jump the 'left' pointer
            // to the right of the previous occurrence (but never move it backward)
            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }

            // Update/insert the last seen index of the character
            map.put(c, right);

            // Calculate the window size and update the max
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
