class Solution {
    public boolean checkDivisibility(int n) {
        int a = n;
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int digit = 0;
            digit = n % 10;
            sum += digit;
            System.out.println(digit);
            product *= digit;
            n = n / 10;
        }
        System.out.println(sum + " " + product);
        if (a % (sum + product) == 0) {
            return true;
        }
        return false;
    }
}