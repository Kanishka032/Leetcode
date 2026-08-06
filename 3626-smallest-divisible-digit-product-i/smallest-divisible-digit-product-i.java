class Solution {
    public int smallestNumber(int n, int t) {
        while (true) {
            int prod = digitProduct(n);

            if (prod % t == 0) {
                return n;
            }

            n++;
        }
    }

    private int digitProduct(int num) {
        int prod = 1;

        while (num > 0) {
            prod *= (num % 10);
            num /= 10;
        }

        return prod;
    }
}