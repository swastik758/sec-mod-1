import java.util.*;
class Greater{
    public static void main (String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        if(a>0){
            System.out.println("The number is positive");

        }
        else{
            System.out.println("The nummber is nagative");
        }
        sc.close();
    }
}


