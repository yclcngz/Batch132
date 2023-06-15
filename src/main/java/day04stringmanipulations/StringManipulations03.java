package day04stringmanipulations;

public class StringManipulations03 {


    public static void main(String[] args) {


        //example 1 : Check the password if it has given rules.
        //           i)it should start with "J"
        //           ii)It should have at least 8 charecters
        //           iii)Last 3 charecters should be "AVA"

        String pwd = "J12!?AVA";

        //i)it should start with "J"
        boolean first = pwd.startsWith("J");
        System.out.println("first rule = " + first);

        //ii)It should have at least 8 charecters
        boolean second = pwd.length()>7;
        System.out.println("second rule  = " + second);

        //iii)Last 3 charecters should be "AVA"
        boolean third = pwd.substring(5).equals("AVA");
        System.out.println("third rule = " + third);


    }




}
