import java.util.*;
public class NameUsingCMD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***Using Command line*** ");

        // Taking Input from User
        System.out.println("Enter your Name: ");
        String name = scanner.nextLine();
        System.out.println("User Input " + name);
    }
}
