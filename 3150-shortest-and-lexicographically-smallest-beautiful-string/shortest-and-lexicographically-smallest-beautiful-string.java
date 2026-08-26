import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        Map<String, Integer> m = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            StringBuilder a = new StringBuilder();
            int count = 0;

            for (int j = i; j < s.length(); j++) {
                a.append(s.charAt(j));

                if (s.charAt(j) == '1') {
                    count++;
                }

                if (count == k) {
                    m.put(a.toString(), j);
                    break; 
                }
            }
        }

        if (m.isEmpty()) {
            return "";
        }

        String smallestKey = Collections.min(m.keySet(), (s1, s2) -> {
            if (s1.length() != s2.length()) {
                return Integer.compare(s1.length(), s2.length());
            }
            return s1.compareTo(s2);
        });

        return smallestKey;
    }
}