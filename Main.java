// Take input from user, store it and print it in array
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter "+size+" numbers: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The array is: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}