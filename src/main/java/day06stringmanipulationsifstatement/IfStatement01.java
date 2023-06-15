package day06stringmanipulationsifstatement;

import java.util.Scanner;

public class IfStatement01 {

       public static void main(String[] args) {

        //Example : If a number is positive, print positive on the console
       int a = 0;


        // 1.Way :

       if (a>0){
            System.out.println("positive");
        }

        if (a<0){
            System.out.println("negative");
        }

        if (a==0){
            System.out.println();
        }

        // 2.Way :

        if (a>0){
            System.out.println("positive");
        } else if (a<0) {
            System.out.println("negative");
        } else {
            System.out.println("neutre");
        }


        // Example 2: Type code that prints day names for the given day numbers
        //          1==> Sunday  2==> Monday ...... 7==> Saturday
           Scanner input = new Scanner(System.in);
           System.out.println("Enter day number to see day name");
           byte day = input.nextByte();

        if (day==1){
            System.out.println("Sunday");
        }
        else if (day==2) {
            System.out.println("Monday");
        }
        else if (day==3) {
            System.out.println("Tuesday");
        }
        else if (day==4) {
            System.out.println("Wednesday");
        }
        else if (day==5) {
            System.out.println("Thursday");
        }
        else if (day==6) {
            System.out.println("Friday");
        }
        else if (day==7) {
            System.out.println("Saturday");
        }else {
            System.out.println("I told you to enter day number, are you good...");
        }


















    }



}
