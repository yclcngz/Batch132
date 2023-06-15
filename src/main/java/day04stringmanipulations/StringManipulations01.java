package day04stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {

        //Example1 : Get the full name of the user and make all characters in upper cases

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name the last name....");
        String fullName = input.nextLine().toUpperCase();


        System.out.println(fullName);

        //Example2 : Get the full name of the user and make all characters in upper cases, and remove
        //          spaces from the beginning and from the and
        System.out.println("Enter your first name the last name....");
        String name = input.nextLine().toUpperCase().trim();

        System.out.println(name);

        //Example3 : Get a String from a user, then count the number of characters in the String
        System.out.println("Enter a String.....");
        String s = input.nextLine();

        int numOfChars = s.length();

        System.out.println(numOfChars);




















    }
}
