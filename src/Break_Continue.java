public class Break_Continue {
    public static void main(String[] args) {
        System.out.println("--- 1. Example with BREAK ---");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // Stop and exit the loop when i is 3
            }
            System.out.println(i);
        }
        System.out.println("\n--- 2. Example with CONTINUE ---");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Skip number 3 and jump to the next number
            }
            System.out.println(i);
        }
    }
}
