//Problem Link https://leetcode.com/problems/valid-anagram/
class Solution {
    public boolean isAnagram(String s, String t) {
        short[] ascii = new short[26];
        for (char ch : t.toCharArray()) {
            ascii[ch - 'a']++;
        }

        for (char ch : s.toCharArray()) {
            ascii[ch - 'a']--;
            if (ascii[ch-'a'] < 0) {
                return false;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (ascii[i] != 0) {
                return false;
            }
        }

        return true;
    } 
}