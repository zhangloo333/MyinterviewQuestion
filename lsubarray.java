import java.util.*;

/**
 * Created by lee on 10/5/16.
 */


public class lsubarray{

    public static int[] compareSub(int arr[]) {
        int start = -1;
        int end = -1;
        int max = 0;
        if (arr.length > 0) {
            //Get that many array elements and compare all of them.
            //Then compare their max to the overall max
            start = 0;
            end = 0;
            max = arr[0];
            for (int arrSize = 1; arrSize < arr.length; arrSize++) {
                for (int i = 0; i < arr.length - arrSize + 1; i++) {
                    int potentialMax = sumOfSub(arr, i, i + arrSize);
                    if (potentialMax > max) {
                        max = potentialMax;
                        start = i;
                        end = i + arrSize - 1;
                    }
                }
            }

        }
        return new int[]{start, end, max};
    }

    public static int sumOfSub(int arr[], int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++)
            sum += arr[i];
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(Arrays.toString(compareSub(arr)));
        // return 3,6,6
    }
}

