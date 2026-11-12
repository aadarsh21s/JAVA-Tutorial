public class Try_Catch_Exception {
    static void main() {
        int[] marks= {88,87,99,97};
        try {
            System.out.println(marks[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {                         //For simple: catch (Exception e) {...}
            System.out.println("Error: Index is out of bounds! " + e.getMessage());
        }
        System.out.println("Program Completed.");
    }
}
