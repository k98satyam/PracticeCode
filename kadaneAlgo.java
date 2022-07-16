//https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1

import java.util.*;

public class kadaneAlgo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER_SIZE_OF_ARRAY_AND_THEN_ARRAY");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long global = arr[0];
        long local = 0;

        for (int i = 0; i < n; i++) {
            local = (arr[i] > local + arr[i]) ? arr[i] : local + arr[i];
            global = (global > local) ? global : local;
        }
        System.out.println(global);
        sc.close();
    }
}