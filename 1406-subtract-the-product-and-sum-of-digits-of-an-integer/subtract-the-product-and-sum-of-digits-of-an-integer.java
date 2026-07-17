class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        int result = 0;

        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            product *= digit;
             sum+= digit;
        }
        

        result=product-sum;
        return result;
    }
}