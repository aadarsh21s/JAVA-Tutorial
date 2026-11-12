import java.util.Scanner;
public class While_Loop {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number fot multiplication : ");
        int num = sc.nextInt();
        int i = 1;
        while (i < 11) {
            System.out.println(num + " x " + i + " = " + num * i);
            i++;
        }
    }
}
