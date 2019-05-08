/*Write a program to set up an array of places, Loop round and remove the vowels. Display the new
words in console
Input:
India
United States
Germany
Egypt
czechoslovakia
Output:
Place Name without Vowels:0 Ind
Place Name without Vowels:1 Untd Stts

Place Name without Vowels:2 Grmny
Place Name without Vowels:3 Egypt
Place Name without Vowels:4 czchslvk*/


package com.stackroute;

import java.util.Scanner;

public class VowelRemove {
    public static void main(String[] s) {
        String original, strnew;

        System.out.println("enter the country names");
        Scanner scn = new Scanner(System.in);
        original = scn.nextLine();

        System.out.println("Actual string" + " " + original);
        strnew = original.replaceAll("[aeiouAEIOU]", "");
        System.out.println("new string is" + " " + strnew);

    }

}

