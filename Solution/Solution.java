import java.util.Map;
import java.util.HashMap;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

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
        // testSomething("aab");
        // System.out.println(s);

        Stack<Integer> pancakes = new Stack<>();
        pancakes.push(1);
        pancakes.push(3);
        pancakes.push(7);
        int seven = pancakes.pop();
        System.out.println("seven: " + seven);

        Queue<Integer> tickets = new LinkedList<>();
        tickets.add(1);
        tickets.add(3);
        tickets.add(7);

        int firstOut = tickets.remove();
        System.out.println("firstOut: " + firstOut);

        return;
    }
}
