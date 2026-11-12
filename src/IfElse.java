import java.util.Scanner;
public class IfElse {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age: ");
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("cant vote");
        }
        else if (age >= 18 && age <= 75) {
            System.out.println("can vote");
        }
        else {
            System.out.println("invalid number!");
        }
    }
}
