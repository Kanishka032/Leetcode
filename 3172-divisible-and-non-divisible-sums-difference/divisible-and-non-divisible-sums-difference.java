class Solution {
    public int differenceOfSums(int n, int m) {
        int divisble = 0;
        int  Notdivisble = 0;

        for (int i = 0; i <= n; i++) {
            if (i % m == 0) {
                divisble += i;
            }
            if (i % m != 0) {
                Notdivisble += i;
            }
        }

        return Notdivisble-divisble;
    }
}