class Solution {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) return false;

        boolean[] seen = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            seen[ch - 'a'] = true;
        }

      
        for (int i = 0; i < 26; i++) {
            if (!seen[i]) return false;
        }

        return true;
    }
}