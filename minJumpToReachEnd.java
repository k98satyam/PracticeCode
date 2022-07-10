//https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1

import java.util.*;

public class minJumpToReachEnd {

    private static final String ENTER_SIZE_OF_ARRAY_AND_THEN_ARRAY = "ENTER SIZE OF ARRAY AND THEN ARRAY";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(ENTER_SIZE_OF_ARRAY_AND_THEN_ARRAY);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(minJump(arr));
        sc.close();

    }

    public static int minJump(int arr[]) {
        int n = arr.length;

        if (n <= 1)
            return 0;

        if (arr[0] == 0)
            return -1;

        int max = arr[0], step = arr[0], jump = 1;

        for (int i = 1; i < n; i++) {
            if (i == n - 1)
                return jump;

            max = Math.max(max, i + arr[i]);
            step--;
            if (step == 0) {
                jump++;
                if (i >= max)
                    return -1;
                step = max - i;
            }
        }
        return -1;
    }

}