import java.util.Scanner;

public class ch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char first = text.charAt(0);
        char last = text.charAt(text.length() - 1);

        System.out.println("First character: " + first);
        System.out.println("Last character: " + last);

        sc.close();
    }
}

