import java.util.Scanner;

public class in {
    public static void main(String []args){
        Scanner sc ;
        
        String a = "Hello";
        String b = "hello";
        System.out.println(a);
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a.length());
        System.out.println(a.charAt(0));
        if (a.equalsIgnoreCase(b)){
            System.out.println("Both  the Strings are equal");
        }
        else{
            System.out.println("They are not equal");
        }


    }
}