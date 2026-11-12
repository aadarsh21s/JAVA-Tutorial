import java.util.Scanner;
public class For_Loop {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number fot multiplication : ");
        int num = sc.nextInt();
        for(int i=1; i<=10; i++) {
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}
