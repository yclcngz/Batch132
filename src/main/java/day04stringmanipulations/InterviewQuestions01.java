package day04stringmanipulations;

public class InterviewQuestions01 {

    public static void main(String[] args) {

        // Example:  Type to swap the integers
        //           a=12 and b=5 ==> a=5 b=12



        //1.Way :By useing 3rd variable...
        int a = 12;
        int b = 5;
        System.out.println(a+" - "+b); //12 - 5

        int temp =0;

        temp = a;
        a = b;
        b= temp;
        System.out.println(a+" - "+b); //5 - 12


        //2.Way: Do not create 3rd variable
        int x = 12;
        int y = 5;
        System.out.println(x+" - "+y);

        x = x+y;

        y = x-y;

        x = x-y;

        System.out.println(x+" - "+y);






















    }

}
