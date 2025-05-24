class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;
        int curr = 0;
        for (char c : t.toCharArray()) {
            if (c == s.charAt(curr)) {
                curr++;
                if (curr == s.length()) return true;
            }
        }
        return false;
    }
}