import java.util.Scanner;
public class TakingInput {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
//        float age = sc.nextFloat()
        System.out.println(age);
        sc.nextLine();  // Consume the trailing newline

        System.out.println("Enter your name:");
//        String name = sc.next();
        String name = sc.nextLine();
        System.out.println("Your name is:" + name);
    }
}
