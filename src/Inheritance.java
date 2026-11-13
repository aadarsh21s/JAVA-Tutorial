// Base class
class Shape {
    public void area() {
        System.out.println("Displays area of the shape!");
    }
}

// Derived class (Single Inheritance)
class Triangle extends Shape {
    public void area(int b, int h) {
        System.out.println("Area of Triangle: " + (0.5 * b * h));
    }
}

// Derived class from Triangle (Multilevel Inheritance)
class EquilateralTriangle extends Triangle {
    // Overloaded method: only needs 1 side 'a'
    public void area(int a) {
        double result = (Math.sqrt(3) / 4) * (a * a);
        System.out.println("Area of Equilateral Triangle: " + result);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        EquilateralTriangle e1 = new EquilateralTriangle();

        // 1. Inherited from Shape:
        e1.area();

        // 2. Inherited from Triangle (base, height):
        e1.area(4, 5);

        // 3. Defined in EquilateralTriangle (side):
        e1.area(6);
    }
}