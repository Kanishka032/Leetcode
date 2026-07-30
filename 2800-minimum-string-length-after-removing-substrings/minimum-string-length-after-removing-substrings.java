class Solution {
    public int minLength(String s) {
        char[] c = s.toCharArray();
        int top = -1;
        for (int i = 0; i < c.length; i++) {
            c[++top] = c[i];
            if (top >= 1) {
                if ((c[top - 1] == 'A' && c[top] == 'B')
                        ||
                        (c[top - 1] == 'C' && c[top] == 'D')) {
top=top-2;
                }

            }
        }
        return top+1;
    }
}