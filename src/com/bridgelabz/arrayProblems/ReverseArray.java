package com.bridgelabz.arrayProblems;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size :");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array element :");
        for (int i=0; i<size; i++){
            arr[i] = scanner.nextInt();
        }
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("Array in reverse element :");
        for (int i=arr.length-1; i>=0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
