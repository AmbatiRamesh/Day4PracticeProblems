package com.bridgelabz.array;

import java.util.Scanner;

public class OddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int length = scanner.nextInt();
        int array[] = new int[10];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        for(int i=1;i<length;i=i+2) {
                System.out.print(array[i]+" ");
        }
    }
}
