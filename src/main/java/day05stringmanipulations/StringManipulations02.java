package day05stringmanipulations;

public class StringManipulations02 {

    public static void main(String[] args) {

        //Exaple 1 : Delete all "e" s  from a give String
        String s = "Everything is easy if you study";

        String newS = s.replace("y","");
        System.out.println("newS = " + newS); //newS = Everthing is eas if ou stud

        // Example 2 : Delete all digits from a given String
        String t = "Tom is 13 years old, and his GPA is 3.98";

        String  t2 = t.replaceAll("[0-9]","");
        System.out.println("t2 = " + t2);  //t2 = Tom is  years old, and his GPA is .

        // Example 3 : Delete all vowels from a given String
        String u = "Tom, are you here?";

        String newU = u.replaceAll("[aeiouAEOIU]","");
        System.out.println("newU = " + newU);//newU = Tm, r y hr?

        // Example 4  : Count how many digits are there in a String
        String n = "Tom is 13 years old, and his GPA is 3.98";

        int newN = n.replaceAll("[^0-9]","").length();
        System.out.println("newN  = " + newN); //newN  = 5

        //Example 5 :Check the user's password according to the given rules
        //           i)Password should have at least 8 characters
        //           ii)Password should not have "space" character
        //           iii)Password should have at least 1 uper case
        //           iv)Password should have at least 1 lower case
        //           v)Password should have at least 1 synbol
        //           vi)Password should have at least 1 digit

        String pwd = "As1?fdes3";

        //i)Password should have at least 8 characters
        boolean first = pwd.length()>7;
        System.out.println("Is the password containing 8 carecters? = " + first);

        //ii)Password should not have "space" character
         boolean second = pwd.replaceAll("[^ ]","").length()==0;
        System.out.println("Is the password containing no space? = " + second);

        //iii)Password should have at least 1 uper case
         boolean third = pwd.replaceAll("[^A-Z]","").length()>0;
        System.out.println("Is the password containing at least 1 uper case ? = " + third);

        //iv)Password should have at least 1 lower case
         boolean fourth = pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println("Is the password containing at least 1 lower case = " + fourth);

        //v)Password should have at least 1 synbol
        boolean fifth = pwd.replaceAll("[a-zA-Z0-9]","").length()>0;
        System.out.println("Is the password containing at least 1 symbol = " + fifth);

        // vi)Password should have at least 1 digit
        boolean sixth = pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println("Is the password containing at least 1 digit = " + sixth);

        System.out.println("is password correct :"+(first&&second&&third&&fourth&&fifth&&sixth)); //is password correct :true


    }




}
