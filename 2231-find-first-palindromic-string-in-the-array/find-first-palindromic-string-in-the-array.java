class Solution {
    public String firstPalindrome(String[] words) {

        for (int i = 0; i < words.length; i++) {
            char[] c = words[i].toCharArray();
            int left = 0;
            int right = c.length - 1;
            while (left < right) {
                char temp = c[left];
                c[left] = c[right];
                c[right] = temp;
                left++;
                right--;
            }
             String reversed = new String(c);

            
            if (words[i].equals(reversed)) {
                return words[i];
            }
        }

        return "";
    }
}