class Solution {
    public List<String> cellsInRange(String s) {
        List<String> result = new ArrayList<>();

        String[] parts = s.split(":");

        String start = parts[0];
        String end = parts[1];

        char startCol = start.charAt(0);
        char endCol = end.charAt(0);

        int startRow = start.charAt(1) - '0';
        int endRow = end.charAt(1) - '0';

        for (char col = startCol; col <= endCol; col++) {
            for (int row = startRow; row <= endRow; row++) {
                result.add("" + col + row);
            }
        }

        return result;
    }
}