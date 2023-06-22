package com.bridgelabz.array;

import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int size = scanner.nextInt();
        int array[] = new int[10];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int smallest = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i]<smallest)
                smallest = array[i];
        }
        System.out.println("SmallestNumber: " + smallest);
    }
}
