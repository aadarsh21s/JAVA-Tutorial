class Learner {
    // Non-static: Each student has their own unique name and roll number
    String name;
    int rollNo;

    // Static variable: Shared by ALL students (common for the whole school)
    static String schoolName = "Oxford High";

    // Static counter: Counts how many students have been created
    static int studentCount = 0;

    // Constructor
    public Learner(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        studentCount++; // Increments the shared counter
    }

    // Non-static method: Uses individual object data
    public void displayStudentInfo() {
        System.out.println("Roll: " + rollNo + " | Name: " + name + " | School: " + schoolName);
    }

    // Static method: Called using class name, does NOT need an object
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + studentCount);
    }
}

public class Static {
    public static void main(String[] args) {
        // Calling static method using the Class name directly:
        Learner.displayTotalStudents(); // Count is 0

        // Creating students
        Learner s1 = new Learner("Alice", 101);
        Learner s2 = new Learner("Bob", 102);

        s1.displayStudentInfo();
        s2.displayStudentInfo();

        // Count is now 2 (both updated the shared variable)
        Learner.displayTotalStudents();

        System.out.println("\n--- Changing Static Variable ---");
        // Change the school name for EVERYONE using the class name:
        Learner.schoolName = "Cambridge Academy";

        s1.displayStudentInfo(); // school changed for Alice
        s2.displayStudentInfo(); // school changed for Bob too!
    }
}