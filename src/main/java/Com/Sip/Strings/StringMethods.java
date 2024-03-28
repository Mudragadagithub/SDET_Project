package Com.Sip.Strings;

public class StringMethods {
        public static void main(String[] args){
            String s1="mudragada ravi kumar";
            System.out.println(s1.length());

          //  concatnation
            String s2="welcome";
            String s3="my house";
            System.out.println(s2+s3);
            System.out.println(s2.concat(s3));
System.out.println("welcome"+"my house");
// equal
            String s4="WELCOME";
            String s5="welcome";
            System.out.println(s4.equals(s5));
            System.out.println(s4.equalsIgnoreCase(s5));
           // substring
            System.out.println(s3.substring(0,3));
            System.out.println(s4.substring(2,5));
              


        }

}
