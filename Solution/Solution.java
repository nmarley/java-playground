import java.util.Map;
import java.util.HashMap;

class Solution {
    public static String testSomething(String s) {
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        // System.out.println(counts.keySet());
        System.out.println(counts);
        return s;
    }

    public static void main(String args[]) {
        // String s = "aab";
        testSomething("aab");
        // System.out.println(s);
        return;
    }
}
