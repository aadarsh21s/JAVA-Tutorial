class Students{
    String name;
    int id;

    public void PrintInfo() {
        System.out.println(this.name);
        System.out.println(this.id);
    }

    Students(Students s2){
        this.name=s2.name;
        this.id=s2.id;
    }

    Students(){

    }
}

public class Copy_Constructors {
    static void main() {
        Students s1 = new Students();
        s1.name="unik";
        s1.id=11;

        Students s2 = new Students(s1);
        s2.PrintInfo();
    }
}
