/**
 * Created by lee on 10/5/16.
 */
import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
    public static void main(String[] args) {

        String newStr = "apple";
        countWords(newStr);


        // a, 1
        // p, 2
        // l, 1
        // e, 1
    }


    public static void countWords(String str) {
        if (str == null || str.length() == 0) {
            return;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                int tmp = map.get(c);
                tmp++;
                map.put(c, tmp);
            }
        }

        for (char c : map.keySet()) {
            int count = map.get(c);
            System.out.println(c + ", " + count);
        }
    }
}
