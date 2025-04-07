class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        int expected = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                expected = freq[i];
                break;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0 && freq[i] != expected) {
                return false;
            }
        }

        return true;
    }
}