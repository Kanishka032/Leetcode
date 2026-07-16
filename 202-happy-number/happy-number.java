class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = getno(n);
        while (fast != 1 && slow != fast) {
            slow = getno(slow);
            fast = getno(getno(fast));
        }
        return fast == 1;
    }

    public static int getno(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }

        return sum;
    }
}