class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        
        int leftSum = 0, rightSum = 0;
        int leftQ = 0, rightQ = 0;
        
        // Traverse string
        for (int i = 0; i < n; i++) {
            char c = num.charAt(i);
            
            if (i < n / 2) {
                if (c == '?') leftQ++;
                else leftSum += c - '0';
            } else {
                if (c == '?') rightQ++;
                else rightSum += c - '0';
            }
        }
        
        // If odd number of '?' → Alice wins
        if ((leftQ + rightQ) % 2 != 0) return true;
        
        int diff = leftSum - rightSum;
        int cnt = leftQ - rightQ;
        
       return 2 * (rightSum - leftSum) != 9 * (leftQ - rightQ);
    }
}