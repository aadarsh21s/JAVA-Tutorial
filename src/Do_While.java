import java.util.Scanner;
public class Do_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for multiplication: ");
        int num = sc.nextInt();

        // --- do-while loop ---
        int i = 1;
        do {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        } while (i <= 10);
        sc.close();
    }
}
