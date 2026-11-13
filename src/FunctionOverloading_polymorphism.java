//Compile time polymorphism
class Stud{
    String name;
    int age;

    public void PrintInfo(String name){
        System.out.println(name);
    }

    public void PrintInfo(int age){
        System.out.println(age);
    }

    public void PrintInfo(String name, int age){
        System.out.println(name +" " + age);
    }
}

public class FunctionOverloading_polymorphism {
    static void main() {
        Stud s1= new Stud();
        s1.name = "Unik";
        s1.age = 22;
        s1.PrintInfo(s1.name, s1.age);
    }
}
