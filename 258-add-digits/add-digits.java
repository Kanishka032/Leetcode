class Solution {
    public int addDigits(int num) {
// ig()
        while (num >9) {
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                sum += digit ; 
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

}