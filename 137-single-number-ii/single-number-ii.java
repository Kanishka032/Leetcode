import java.util.HashMap;
import java.util.Map;

class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        // 1. Har number ka count map mein store karo
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 2. Map mein check karo kis number ka count 1 hai
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey(); // Wohi single number return kar do
            }
        }

        // 3. Fallback return (Agar input galat ho ya koi single element na mile)
        return -1;
    }
}
