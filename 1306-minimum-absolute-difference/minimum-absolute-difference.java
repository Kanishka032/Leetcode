class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();

        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            minDiff = Math.min(minDiff, arr[i] - arr[i - 1]);
        }

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] - arr[j-1] == minDiff) {
            List<Integer> pair = new ArrayList<>();
                pair.add(arr[j - 1]);
                pair.add(arr[j]);
                result.add(pair);
            }
        }
        return result;
    }
}