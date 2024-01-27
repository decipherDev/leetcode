class Solution {
    public int characterReplacement(String s, int k) {
        int[] map = new int[26];
        int window=0;
        int left = 0;
        int maxSize=0;
        int result=0;
        int index = 0;
        for (int i=0; i<s.length(); i++) {
            index = s.charAt(i) - 'A';
            map[index]++; 
            maxSize = Math.max(map[index], maxSize);
            window++;
            if (!(window - maxSize <= k)) {
                map[s.charAt(left)- 'A']--;
                window--;
                left++;
            } else {
                result = Math.max(window, result);
            }  
        }
        return result;
    }
}
