interface Ani {
    // Interface variables are automatically 'public static final' (constants)
    int eyes = 2;

    // Abstract method (no body)
    void walk();
}

interface Herbivore {
    // 'default' allows methods inside interfaces to have a body
    default void veg() {
        System.out.println("Only eats veg.");
    }
}

// Multiple inheritance through interfaces
class Hor implements Ani, Herbivore {
    @Override
    public void walk() {
        System.out.println("Walks on 4 legs.");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Hor h1 = new Hor();

        h1.walk();              // Implemented in Hor
        h1.veg();               // Inherited default method from Herbivore
        System.out.println("Eyes: " + Ani.eyes); // Constant from Ani interface
    }
}