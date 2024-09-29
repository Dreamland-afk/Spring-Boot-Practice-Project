package com.dreamquest.practice.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

//        int[] arr = {51, 20, 79, 99, 49, 83, 97, 50, 48, 54, 19, 25, 77, 71, 91, 98, 82, 34, 1, 80, 35, 18, 96, 5, 85, 10, 70, 47, 23, 72, 84, 68, 65, 8, 7, 30, 69, 43, 41, 21, 11, 66, 3, 60, 46, 88, 53, 90, 93, 39, 26, 52, 36, 73, 33, 62, 58, 14, 61, 31, 17, 75, 81, 2, 13, 94, 9, 63, 4, 56, 92, 78, 12, 55, 15, 42, 38, 44, 16, 37, 24, 67, 32, 89, 76, 27, 100, 28, 22, 45, 29, 40, 87, 64, 74, 86, 57, 95, 6, 59};

        int[] arr = {33,7,1,5,3};

        long start = System.currentTimeMillis();
        for(int i = 0 ; i < arr.length -1; i++)
        {
            for(int j = 0 ; j < (arr.length - 1 - i) ; j++ )
            {
                if(arr[j] < arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }


            }
            for (int a : arr)
                System.out.print(a + " ");
            System.out.println();
        }

        long end = System.currentTimeMillis();
//        Arrays.stream(arr).forEach(System.out::println);
        System.out.println("Time took: " + (end - start));
    }
}
