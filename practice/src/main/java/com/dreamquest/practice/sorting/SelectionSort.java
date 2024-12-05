package com.dreamquest.practice.sorting;

import org.springframework.web.util.pattern.PathPattern;


public class SelectionSort {

    public static void main(String[] args) {

//        int[] arr = {51, 20, 79, 99, 49, 83, 97, 50, 48, 54, 19, 25, 77, 71, 91, 98, 82, 34, 1, 80, 35, 18, 96, 5, 85, 10, 70, 47, 23, 72, 84, 68, 65, 8, 7, 30, 69, 43, 41, 21, 11, 66, 3, 60, 46, 88, 53, 90, 93, 39, 26, 52, 36, 73, 33, 62, 58, 14, 61, 31, 17, 75, 81, 2, 13, 94, 9, 63, 4, 56, 92, 78, 12, 55, 15, 42, 38, 44, 16, 37, 24, 67, 32, 89, 76, 27, 100, 28, 22, 45, 29, 40, 87, 64, 74, 86, 57, 95, 6, 59};

        int[] arr = {33,7,1,5};

        int i,j;
        int min =Integer.MAX_VALUE;
        long start = System.currentTimeMillis();


        for(i = 0 ; i < arr.length -1  ; i++)
        {
            min  = i;

            for( j = i + 1  ; j < arr.length ; j++ )
            {

                    if(arr[min]  > arr[j])
                    {
                        min = j;
                    }
            }


                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;



            printArray(arr);
        }

        long end = System.currentTimeMillis();

        System.out.println("Time took: " + (end - start));
    }

    private static void printArray(int[] arr) {

        for (int a : arr)
            System.out.print(a + " ");
        System.out.println();
    }
}
