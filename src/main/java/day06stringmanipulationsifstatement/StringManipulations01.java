package day06stringmanipulationsifstatement;

public class StringManipulations01 {

    public static void main(String[] args) {


        //Example 1 : Type code to find to index of the first occurrence of 'a' given String
        //            Alabama ==>


        String s = "Alabama";
        int idxA = s.indexOf('a');
        System.out.println("idxA = " + idxA); //idxA = 2


        // Example 2:  type code to find to index of the first occurrence of 'java' a given String
        //             "java is easy to learn, java is common in the market, java is OOP"
        String t = "java is easy to learn, java is common in the market, java is OOP";
        int idxJava =t.indexOf("java");
        System.out.println("idxJava = " + idxJava); //idxJava = 0

        //Example 3:  type code to find to index of the last occurrence of 'm' in a given String

        String u = "miami";
        int idxM = u.lastIndexOf('m');
        System.out.println("idxM = " + idxM); //idxM = 3

        //Example 4:  type code to find to index of the last occurrence of 'earn' in a given String
        //            Learn Java earn money ==> 11
        String v = "Learn Java earn money";
       int idxEarn = v.lastIndexOf("earn");
        System.out.println("idxEarn = " + idxEarn); //idxEarn = 11


        //Example5 : Type code to check if a given character is unique or not is a given String
        //         miami==> 'a'----->unique  'i'--------> Not unique

        String str = "miami";
        char ch = 'a';

        boolean r1 = str.indexOf(ch)==str.lastIndexOf(ch);
        System.out.println("Is the character unique : = " + r1);


    }


}
