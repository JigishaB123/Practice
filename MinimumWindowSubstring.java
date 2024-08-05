//Minimum Window Substring Java
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        String s="ADOBECODEBANC";
        String t="ABC";
        System.out.println("Try programiz.pro");
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : t.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int matched = 0;
        int start = 0;
        int minLen = s.length() + 1;
        int subStr = 0;
        for (int endWindow = 0; endWindow < s.length(); endWindow++) {
            char right = s.charAt(endWindow);
            System.out.println("*****endw = " + endWindow + "******");
            System.out.println("right = " + right);
            if (map.containsKey(right)) {
                map.put(right, map.get(right) - 1);
                if (map.get(right) == 0) matched++;
                System.out.println("map key = " + right + "value = " + map.get(right));
                System.out.println("matched = " + matched);    
            }

            while (matched == map.size()) {
                System.out.println("in while minlen = " + minLen);
                if (minLen > endWindow - start + 1) {
                    minLen = endWindow - start + 1;
                    subStr = start;
                    System.out.println("minlen = " + minLen + "substr " + subStr);
                }
                char deleted = s.charAt(start++);
                if (map.containsKey(deleted)) {
                    if (map.get(deleted) == 0) matched--;
                    map.put(deleted, map.get(deleted) + 1);
                    System.out.println("deleted key = " + deleted + " value " + map.get(deleted) + " start " + start);
                }
            }
        }
		return minLen > s.length() ? "" : s.substring(subStr, subStr + minLen);
        System.out.println("end minlen = " + minLen + "subStr " + subStr + " substring " + s.substring(subStr, subStr + minLen));
    }
}
