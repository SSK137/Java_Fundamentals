import java.util.Scanner;

public class String_equalornot {
    public static void main(String[] args) {
        String a;
        String b;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter First Name");
        a= scanner.next();
        System.out.println("Enter Second Name");
        b=scanner.next();
        System.out.println(a.equals(b));
    }
}
