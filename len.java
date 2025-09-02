import java.util.Scanner;

public class len {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        System.out.println("Length of the string is: " + text.length());
        sc.close();
    }
}
