class Students{
    String name;
    int id;

    public void PrintInfo() {
        System.out.println(this.name);
        System.out.println(this.id);
    }

    Students(String name, int id){
        this.name=name;
        this.id=id;
    }
}
public class Parameterized_Constructor {
    static void main() {
        Students s1 = new Students("unik", 11);
        s1.PrintInfo();
    }
}
