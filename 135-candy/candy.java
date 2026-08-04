class Solution {
    public int candy(int[] rating) {
        int n = rating.length;
        int[] a = new int[rating.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = 1;
        }
 
        for (int i = 1; i < n; i++) {
            if (rating[i] > rating[i - 1]) {
                a[i] = a[i - 1] + 1;
            }

        }

        for (int i = n - 2; i >= 0; i--) {
            if (rating[i] > rating[i + 1]) {
                a[i] = Math.max(a[i], a[i + 1] + 1);

            }
        }
        int sum = 0;
        for (int c : a) {
            sum += c;
        }
        return sum;
    }
}