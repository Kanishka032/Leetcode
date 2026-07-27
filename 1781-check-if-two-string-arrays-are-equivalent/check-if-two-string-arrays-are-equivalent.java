class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String result = String.join("", word1);

        String result1 = String.join("", word2);

        return result1.equals(result);
    }
}