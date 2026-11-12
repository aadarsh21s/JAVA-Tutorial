class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Good to go.");
    }

    public void PrintColor() {
        System.out.println(this.color);
    }

    public void PrintType() {
        System.out.println(this.type);
    }
}
public class Class_Object {
    static void main() {
        Pen p1 = new Pen();
        p1.color="blue";
        p1.type="Gel_Pen";

        Pen p2 = new Pen();
        p2.color="black";
        p2.type="Ball_Pen";

        p1.PrintColor();
        p1.PrintType();
        p1.write();

        p2.PrintColor();
        p2.PrintType();
        p2.write();
    }
}
