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

Create a function that will find out the number of pairs that add up equal to target integer

Parameters:
1)an array of unique integers
2)an integer

For example:
1) {9,3,6,1,0,5,7,2}
2) 10

the function output will be: 2
(9,1),(3,7)


 */

// input int[], int
// output int

//9 10 - 9 //1
//3 10- 3  //7
//6 10 -6 //4


class Solution1 {

    public static int addSolution(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        // Use two pointers
        Arrays.sort(arr);

        int start = 0;
        int end = arr.length - 1;
        int count = 0;

        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum == target) {
                count++;
                start++;
                end--;
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }

        return count;
    }

// Use HashSet

    int getCount ( int[] array, int target){
        int result = 0;
        Set<Integer> value = new HashSet<>();
        for (int i : array) {
            int check = target - i;
            if (value.contains(check)) {
                result++;
            } else {
                value.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
//     ArrayList<String> strings = new ArrayList<String>();
//     strings.add("Hello, World!");
//     strings.add("Welcome to CoderPad.");
//     strings.add("This pad is running Java 8.");

//     for (String string : strings) {
//       System.out.println(string);
//     }
//   }

        int[] input = new int[]{9,3,6,1,0,5,7,2};
        int target = 10;

        System.out.println(addSolution(input, target));
    }
}