import java.util.*;
class greater {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter Second number");
        int b = sc.nextInt();
        if(a>b){
            System.out.println("the greater number is "+a);
        } else if (b>a) {
            System.out.println("the greater number is "+b);
        } else {
            System.out.println("both num are equal");
        }
        sc.close();
}
}
