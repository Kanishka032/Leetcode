class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int[] arriavlTime = new int[dist.length];
        for (int i = 0; i < dist.length; i++) {

            // arriavlTime[i] = (int) Math.ceil(dist[i] / speed[i]);
            arriavlTime[i] = (dist[i] + speed[i] - 1) / speed[i];
            System.out.println(arriavlTime[i]);

        }
        Arrays.sort(arriavlTime);
        for (int i = 0; i < dist.length; i++) {
           
                if (arriavlTime[i] <= i) {
                   return i;

                } 
            
            // return i;
        }

        return dist.length;
    }
}