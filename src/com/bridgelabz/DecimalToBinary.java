package com.bridgelabz;

import java.util.Scanner;

public class DecimalToBinary {
    public void binaryConversion(int number) {
        int binary[] = new int[50];
        int index = 0;

        while (number != 0)
        {
            binary[index++] = number % 2;
            number = number / 2;
        }
        for (int i = index-1; i >=0; i--)
        {
            System.out.print(binary[i]);
        }
    }

    public static void main(String a[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the decimal number:");
        int n = s.nextInt();
        DecimalToBinary obj = new DecimalToBinary();
        System.out.print("Binary Representation is:");
        obj.binaryConversion(n);
    }
}