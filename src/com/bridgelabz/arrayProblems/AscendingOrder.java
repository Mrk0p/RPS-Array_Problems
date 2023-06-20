package com.bridgelabz.arrayProblems;

import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size :");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int temp = 0;
        System.out.println("Enter array element :");
        for (int i=0; i<size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Elements of original array :");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.println(" ");

        System.out.println("Element of array sorted in ascending order :");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
