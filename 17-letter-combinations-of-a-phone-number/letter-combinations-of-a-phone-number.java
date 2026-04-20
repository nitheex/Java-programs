import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() == 0) return result;

        String[] map = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        backtrack(result, map, digits, "", 0);
        return result;
    }

    private void backtrack(List<String> result, String[] map, String digits, String current, int index) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }

        String letters = map[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            backtrack(result, map, digits, current + letters.charAt(i), index + 1);
        }
    }
}
