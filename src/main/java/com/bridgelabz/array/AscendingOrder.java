package com.bridgelabz.array;

import java.util.Scanner;
public class AscendingOrder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number of elements :");
        int length =scanner.nextInt();
        Integer array[]=new Integer[length];
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<length;i++)
        {
            array[i]=scanner.nextInt();
        }
        int temp = 0;
        for (int i = 0; i < array.length; i++)
        {
            for (int j = i+1; j < array.length; j++)
            {
                if(array[i] > array[j])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
