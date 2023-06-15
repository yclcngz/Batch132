package day07ifstatementternarystatment;

import java.util.Scanner;

public class NestedIfStatement01 {

    public static void main(String[] args) {


        //Example 1: If the worker is male and the age is grater than 65 he will be retired otherwise he should work
        //           If the worker is female and the age is greater than 60 she will be retired oterwise she should work
        //          If the worker  does not define himself as male or female print "Undefined" on the console

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your gender like male, female or other");
        String gender = input.next();

        System.out.println("Enter your age");
        byte age = input.nextByte();


        if (age < 0) {
            System.out.println("invalid age");
        } else if (gender.equalsIgnoreCase("male")) {
            if (age < 66) {
                System.out.println("he should work");
            } else {
                System.out.println("he should be retired");
            }
        } else if (gender.equalsIgnoreCase("female")) {
            if (age < 61) {
                System.out.println("she should work");
            } else {
                System.out.println("she shold be reired");
            }
        } else {
            System.out.println("Undefined");
        }


    }


}
