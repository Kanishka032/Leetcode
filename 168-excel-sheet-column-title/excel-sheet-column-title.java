class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            int remainder = columnNumber % 26;
            char a = (char) ('A' + remainder);
            columnNumber = columnNumber / 26;
            result.append(a);
        }
        return result.reverse().toString();
    }
}