class Solution {
    public int maxProfit(int[] price) {
        //aaj ka price kal se bada hai toh profit
        int smallest = Integer.MAX_VALUE;
        int profit = 0;
        int maximum=0;
        for (int i = 0; i < price.length; i++) {

            if (price[i] < smallest) {
                smallest = price[i];
            }
            profit = price[i] - smallest;
            if(profit>maximum)
            {
                maximum=profit;
            }

        }
        return maximum;
    }
}