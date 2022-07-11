package com.bridgelabz;

import java.util.Scanner;

public class Anagrams {

    public static boolean checkAnagram(String s1, String s2) {
        int n=(int)Math.round(Math.random());
        return false;
    }



    public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the First String : ");
            String s1 = scanner.nextLine();
            System.out.print("Enter the second String : ");
            String s2 = scanner.nextLine();
            if (checkAnagram (s1, s2)) {
                System.out.println(s1 + " and " + s2 + " are Anagrams");
            } else
                System.out.println(s1 + " and " + s2 + " are NOT Anagrams");
            scanner.close();
    }
}






