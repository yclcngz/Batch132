package day07ifstatementternarystatment;

import java.util.Scanner;

public class IfStatement01 {


    public static void main(String[] args) {

        //Example 1: Type code to check if a give charecter is upper case or others

        char ch = 'p';

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Upper case...");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lower case...");
        } else {
            System.out.println("Others...");
        }


        //Example 2: If number is less than 300 or greater than 3000 print "Perfect Number" on the console, otherwise
        //    print "Regular Number" on the console.

        int num = 320;

        if (num < 300 || num > 3000) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Regular Number");
        }

        //Example 3: Type code to check if a number is "Even" or "Odd"
        int n = -1;

        if (n % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        //Example 4: Write the code that takes the month number from the user and given the month name.
        //         2--->Februrary   5--->May   12--->December    Tom--->Invalid mont number
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a mont number...");
        byte montNumber = input.nextByte();

        if (montNumber == 1) {
            System.out.println("January");
        } else if (montNumber == 2) {
            System.out.println("February");
        } else if (montNumber == 3) {
            System.out.println("March");
        } else if (montNumber == 4) {
            System.out.println("April");
        } else if (montNumber == 5) {
            System.out.println("May");
        } else if (montNumber == 6) {
            System.out.println("June");
        } else if (montNumber == 7) {
            System.out.println("July");
        } else if (montNumber == 8) {
            System.out.println("August");
        } else if (montNumber == 9) {
            System.out.println("September");
        } else if (montNumber == 10) {
            System.out.println("October");
        } else if (montNumber == 11) {
            System.out.println("November");
        } else if (montNumber == 12) {
            System.out.println("December");
        } else {
            System.out.println("Invalid mont number...");
        }


        //Example  5: Type code to print the number of month for the given mont name
        //          Februrary--->2   May--->5   December--->12    Tom--->Invalid mont name

        String monthName = "apriL";

        if (monthName.equalsIgnoreCase("January")){
            System.out.println("1");
        } else if (monthName.equalsIgnoreCase("February")){
            System.out.println(2);
        } else if (monthName.equalsIgnoreCase("March")){
            System.out.println(3);
        } else if (monthName.equalsIgnoreCase("April")){
            System.out.println(4);
        } else if (monthName.equalsIgnoreCase("May")){
            System.out.println(5);
        } else if (monthName.equalsIgnoreCase("June")){
            System.out.println(6);
        } else if (monthName.equalsIgnoreCase("July")){
            System.out.println(7);
        } else if (monthName.equalsIgnoreCase("August")){
            System.out.println(8);
        } else if (monthName.equalsIgnoreCase("September")){
            System.out.println(9);
        } else if (monthName.equalsIgnoreCase("October")){
            System.out.println(10);
        } else if (monthName.equalsIgnoreCase("November")){
            System.out.println(11);
        } else if (monthName.equalsIgnoreCase("December")){
            System.out.println(12);
        } else {
            System.out.println("Invalid mont name");
        }


    }


}
