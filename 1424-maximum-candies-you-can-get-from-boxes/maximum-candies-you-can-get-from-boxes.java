import java.util.*;

class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {

        int n = status.length;
        boolean[] haveBox = new boolean[n];   // do we have this box?
        boolean[] haveKey = new boolean[n];   // do we have key for this box?
        boolean[] opened = new boolean[n];    // already opened?

        Queue<Integer> q = new LinkedList<>();

        // Step 1: initialize with initialBoxes
        for (int box : initialBoxes) {
            haveBox[box] = true;
            if (status[box] == 1) {
                q.add(box);
                opened[box] = true;
            }
        }

        int total = 0;

        // Step 2: BFS
        while (!q.isEmpty()) {
            int box = q.poll();

            // collect candies
            total += candies[box];

            // collect keys
            for (int key : keys[box]) {
                if (!haveKey[key]) {
                    haveKey[key] = true;

                    // if we already have this box and not opened yet
                    if (haveBox[key] && !opened[key]) {
                        q.add(key);
                        opened[key] = true;
                    }
                }
            }

            // collect contained boxes
            for (int b : containedBoxes[box]) {
                if (!haveBox[b]) {
                    haveBox[b] = true;

                    // if box is open OR we have key
                    if ((status[b] == 1 || haveKey[b]) && !opened[b]) {
                        q.add(b);
                        opened[b] = true;
                    }
                }
            }
        }

        return total;
    }
}