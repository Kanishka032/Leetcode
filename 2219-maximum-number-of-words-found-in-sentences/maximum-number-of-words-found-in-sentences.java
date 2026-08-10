class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            System.out.println(sentences[i]);
            int count = 0;
             String[] a = sentences[i].split(" ");
            for (int j = 0; j <a.length; j++) {
                System.out.print(a[j]);
                count++;
                if (count > max) {
                    max = count;
                }

            }
        }
        return max;
    }
}