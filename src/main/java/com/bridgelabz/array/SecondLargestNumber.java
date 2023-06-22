package com.bridgelabz.array;

import java.util.Scanner;
public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int length = scanner.nextInt();
        int array[] = new int[10];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        for(int i=0;i<length;i++)
        {
            for(int j=i+1;j<length;j++)
            {
                if(array[i]<array[j])
                {
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println("Second Largest element is "+array[1]);
    }
}

