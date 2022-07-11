package com.bridgelabz;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n=10;
        int firstTerm = 0;
        int secondTerm = 1;
        System.out.println("Enter the fibonacci series:"+n+"Terms:");
        for (int i = 1; i <+n ; i++) {
            System.out.print(firstTerm+ " ");
            int sum =firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=sum;
        }
    }
}
