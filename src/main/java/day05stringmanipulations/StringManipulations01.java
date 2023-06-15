package day05stringmanipulations;

public class StringManipulations01 {

    public static void main(String[] args) {

        //Example 1: Type code to check if the seventh character of a given String is"a" or not
        String s = "Alabama state";

        boolean resault1 = s.substring(6, 7).contains("a");
        System.out.println("is the seven character  a? :" + resault1);

        boolean resault2 = s.charAt(6) == 'a';
        System.out.println("is the seven character  a? = " + resault2);

        boolean resault3 = s.startsWith("a", 6);
        System.out.println("is the seven character  a? = " + resault3);


        // Example 2: Type code to check if a String is ending with "money" or not

        String t = "Learn Java earn money";

        boolean res1 = t.endsWith("money");
        System.out.println("is String ending with money : = " + res1);

        boolean res2 = t.substring(t.length()-5).equals("money");
        System.out.println("is the String ending with money : = " + res2);


        // Example 3: Type code to convert "money" to "dollor"?
         String newT = t.replace("money","dollar");

        System.out.println("newT = " + newT);  //newT = Learn Java earn dollar
        System.out.println("t = " + t);   //t = Learn Java earn money

        // Example : Type code to convert "a" to "*"?
         String newt2 = t.replace("a","*");
        System.out.println("newt2 = " + newt2); //newt2 = Le*rn J*v* e*rn money

        String t2 = t.replace("earn","win");
        System.out.println("t2 = " + t2);  //t2 = Lwin Java win money


    }
}
