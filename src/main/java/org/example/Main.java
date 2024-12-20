package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] array = {4, 1, 5, 6, 23, 0, 5232, 241, 44, 234};

        int compareCount = 0;
        int swapCount = 0;
        // Printing the original array
        System.out.println(Arrays.toString(array));

        int length = array.length;

        // Bubble sort algorithm
        for (int i = 0; i < length-1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                compareCount++;
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapCount++;
                }
            }
        }

        // Printing the sorted array
        System.out.println("Sorted array: " + Arrays.toString(array));
        System.out.println("Total comparisons: " + compareCount);
        System.out.println("Total swaps: " + swapCount);

    }
}