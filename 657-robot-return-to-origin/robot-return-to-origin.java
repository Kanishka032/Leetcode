class Solution {
    public boolean judgeCircle(String moves) {
        int up = 0;
        int down = 0;
        int left = 0;
        int right = 0;

        char[] c = moves.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i]== 'U') {
                up++;
            }
            if (c[i] == 'D') {
                down++;
            }
            if (c[i] == 'R') {
                right++;
            }
            if (c[i] == 'L') {
                left++;
            }
        }
        if ((up - down == 0) && (left - right) == 0) {
            return true;
        }
        return false;
    }
}