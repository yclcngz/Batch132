package day04stringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {

        //EX : Get the first 4 characters from a String and convert to lower cases
        //     Albania==>Alba==>alba
        String s = "Albania";
       String newAlb = s.substring(0,4).toLowerCase();
        System.out.println(newAlb);  //alba

        //EX2 : Check if two String are samae or not?
        String r = "Java";
        String u = "java";

        boolean sameEqualSign = r==u;
        System.out.println("sameEqualSign = " + sameEqualSign);

        boolean esitMi = r.equals(u);
        System.out.println(esitMi); //false

      boolean same =  r.equalsIgnoreCase(u);
        System.out.println(same);  //true

        String s1 = "TechPro";
        String s2 = "TechPro";

        boolean r1 = s1==s2;
        System.out.println("r1 = " + r1);

        boolean r2 = s1.equals(s2);
        System.out.println("r2 = " + r2);

        String t1 = "Phyton";
        String t2 = new String("Phyton");

       boolean d1 = t1==t2;
        System.out.println("d1 = " + d1);

        boolean d2= t1.equals(t2);
        System.out.println("d2 = " + d2);


    }


}
