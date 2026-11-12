class Student{
    String name;
    int id;

    public void PrintInfo() {
        System.out.println(this.name);
        System.out.println(this.id);
    }

    Student(String name, int id){
        this.name=name;
        this.id=id;
    }
}
public class Parameterized_Constructor {
    static void main() {
        Student s1 = new Student("bee", 21);
        s1.PrintInfo();
    }
}
