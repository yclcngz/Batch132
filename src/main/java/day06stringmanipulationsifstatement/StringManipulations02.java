package day06stringmanipulationsifstatement;

public class StringManipulations02 {


    public static void main(String[] args) {



        String s = "Java";

        //1.Way:
        boolean r1 = s.length()==0;
        System.out.println("Is the given String empty? = " + r1);


          //2.Way:
         boolean r2 = s.isEmpty();
        System.out.println("Is the given String empty? = " + r2);


        //Example2 : Type code to check if a give String is containing just "space character" or not
        //          "   " ==> true   -    "z  x" ==>false

        String t = "     ";
        boolean r3 = t.replaceAll("[  ]","").length()==0;
        System.out.println(r3);

        boolean r4 = t.isBlank();
        System.out.println(r4);

        //Example 3 :Type code to join multiple String
        //          "ParkLand" - "Miami" - "USA" ===>ParkLandMiamiUSA
        String u1 = "ParkLand";
        String u2 = "Miami";
        String u3 = "USA";
        //1.Way:
        String concat =  u1.concat(u2).concat(u3);
        System.out.println(concat);  //ParkLandMiamiUSA

        //2.Way:
        String result = u1+u2+u3;
        System.out.println(result);


    }

}
