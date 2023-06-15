package day06stringmanipulationsifstatement;

public class StringManipulations03 {


    public static void main(String[] args) {

        //Example 1 : Type code to check if given String contains a spesifik character or characters
        //           "New York" ==> w----> true  - York --> true   -  Xxx --->false

        String s = "New York";
        boolean str = s.contains("Miami");
        System.out.println(str);

        //Example 2 : Type code to chang the first occurrent of "java" to "phyton"
        //          java is java, I like java ==> phyton is java, I like java

        String r = "java is java, I like java";
        String u = r.replaceFirst("java","phyton");
        System.out.println(u);  //phyton is java, I like java


        //Example 3 : Type code to repeat a give String
        //          "Java"  4 times ==> JavaJavaJavaJava

        String d = "Java";

        //1. Way :
        String d1 = d+d+d+d;
        System.out.println(d1); //JavaJavaJavaJava

        //2. Way :
        String d2 = d.concat(d).concat(d).concat(d);
        System.out.println(d2); //JavaJavaJavaJava

        //3. Way :
        String d3 = d.repeat(4);
        System.out.println(d3); //JavaJavaJavaJava


    }


}
