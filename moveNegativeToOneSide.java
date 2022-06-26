//Question -- https://www.geeksforgeeks.org/move-negative-numbers-beginning-positive-end-constant-extra-space/

import java.util.*;

public  class moveNegativeToOneSide {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        //using 2 methods to solve
        System.out.println("Press 1 for 2 Pointer Sol \nPress 2 (or any Key) for my stupid solution");
        switch(sc.nextInt()) {
            case 1:
                toPointerSol();
                break;
            default:
                stupidSol();
        }
    }

    public static void stupidSol() {
        System.out.println("Enter array size first then elements");
        int arrSize = sc.nextInt();

        //Pointers to keep track of where positive and negative number are in array
        int positive = -1;
        int negative = -1;
        int temp;

        int[] array = new int[arrSize];
        for (int i = 0; i < arrSize; i++) 
            array[i] = sc.nextInt();

        //Find First Instance of +ve number
        for (int i = 0; i < arrSize ; i++ ) {
            if (array[i] >= 0) {
                positive = i;
                break;
            }
        }

        System.out.println("POSITIVE INDEX - " + positive);

        //Putting array elements in order
        for (int i = 0; i < arrSize; i++) {
            if (array[i] < 0) 
                negative = i;
            if (negative > positive) {
                //Swap logic, swapping array elements
                temp = array[positive];
                array[positive] = array[negative];
                array[negative] = temp;
                //Swapping pointers

                negative = positive;
                for (int j = negative; j < arrSize; j++) {
                    if (array[j] >= 0) {
                        positive = j;
                        break;
                    }
                }
            }
        }

        System.out.println("OUTPUT!!!");
        
        for (int i : array) {
            System.out.println(i + " ");
        }
    }

    public static void toPointerSol() {
        System.out.println("Enter array size first then elements");
        int arrSize = sc.nextInt();

        int[] array = new int[arrSize];
        for (int i = 0; i < arrSize; i++) 
            array[i] = sc.nextInt();

        int left = 0;
        int right = arrSize - 1;
        int temp = 0;

        while (left <= right) {
            //if both left and right are negative move left pointer forward
            if (array[left] < 0 && array[right] < 0) {
                left++;
            }
            //if left = +ve and right = -ve, swap them, inc left and dec right 
            else if (array[left] >= 0 && array[right] < 0){
                temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;   
            }
            //if both left and right are +ve, dec right
            else if (array[left] >= 0 && array[right] >= 0) {
                right--;
            }
            else {
                left++;
                right--;
            }
        }

        System.out.println("OUTPUT!!!");
        
        for (int i : array) {
            System.out.println(i + " ");
        }
    }
}