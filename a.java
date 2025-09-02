import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String replaced = text.replace('a', 'o');
        System.out.println("Modified string: " + replaced);

        sc.close();
    }
}
 
