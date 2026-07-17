class Solution {
    public int calPoints(String[] operations) {
        int result = 0;
   List<Integer> list = new ArrayList<>();

        for (int i = 0; i < operations.length; i++) {
            if (!operations[i].equals("C") &&
                    !operations[i].equals("D") &&
                    !operations[i].equals("+")) {
                 list.add(Integer.parseInt(operations[i]));
            }
            if (operations[i].equals("C")) {
            list.remove(list.size()-1);
            }
             if (operations[i].equals("D")) {
                list.add(2 * list.get(list.size() - 1));

            } 
             if (operations[i].equals("+")) {
                int n = list.size();
                list.add(list.get(n - 1) + list.get(n - 2));

            }

        }
            int sum=0;
            for (int num : list) {
            sum += num;
        }
        return sum;
    }
}