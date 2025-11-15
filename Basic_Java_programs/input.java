import java.util.*;
class input{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        int d=a-b;
        int e=a*b;
        float f=a/b;
        System.out.println("addition"+c);
        System.out.println("subraction"+d);
        System.out.println("multiplication"+e);
        System.out.println("division"+f);
    }
}