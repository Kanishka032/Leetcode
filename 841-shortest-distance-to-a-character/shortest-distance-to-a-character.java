class Solution {
    public int[] shortestToChar(String s, char b) {
        int m = s.length();
        char[] c = s.toCharArray();
        int[] a = new int[m];
        int k = 0;
        int[] collect = new int[m];

        for (int i = 0; i < c.length; i++) {
            if (c[i] == b) {
                collect[k] = i;
                k++;
            }
        }

        for (int i = 0; i < c.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < k; j++) {
                min = Math.min(min, Math.abs(i - collect[j]));
            }
            a[i] = min;
        }

        return a;
    }
}