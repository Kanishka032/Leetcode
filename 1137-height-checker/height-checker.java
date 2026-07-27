class Solution {
    public int heightChecker(int[] heights) {
        int[] temp = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            temp[i] = heights[i];
        }

        Arrays.sort(heights);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            for (int j = i; j < temp.length; j++) {
                if (temp[j] != heights[i]) {
                    count++;
                    break;
                } else {
                    break;
                }
            }
        }

        return count;
    }
}