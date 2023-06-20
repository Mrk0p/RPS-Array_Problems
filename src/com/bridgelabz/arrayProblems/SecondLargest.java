package com.bridgelabz.arrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size :");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array element :");

        for (int i=0; i<size; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("The second largest number :"+ arr[size-2]);
    }
}
