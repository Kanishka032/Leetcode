class Solution {
    public String clearDigits(String s) {

        char[] c = s.toCharArray();
        int k = 0;
        for (int i = 0; i < c.length; i++) {
            if (Character.isLetter(c[i])) {
                c[k++] = c[i];
            }
            if(Character.isDigit(c[i]))
            {
                if (k > 0) k--; 
            }
        }

        
        return new String(c, 0, k);
    }
}