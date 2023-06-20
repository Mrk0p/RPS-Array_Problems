package com.bridgelabz.arrayProblems;

import java.util.Scanner;

public class OddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size :");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array element :");
        for (int i=0; i<size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Element of given array present on odd position :");

        for (int i=0 ;i<arr.length; i=i+2) {
            System.out.println(arr[i]);
        }
    }
}
