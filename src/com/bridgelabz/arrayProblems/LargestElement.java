package com.bridgelabz.arrayProblems;

import java.util.Scanner;

public class LargestElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size :");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array element :");
        for (int i=0; i < size; i++){
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        for (int i=0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Largest element present in given array :"+ max);
    }
}
