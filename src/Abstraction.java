abstract class Animal {
    Animal () {              //This is a constructor
        System.out.println("Creating a animal.");
    }
    abstract void Walk();    //we can also use abstract here and close the function using ; rather than using {}.
    public void eats(){
        System.out.println("Animals Eats");
    }
}

class Hourse extends Animal {
    Hourse(){            //This is a constructor.
        System.out.println("Creating a hourse.");
    }
    public void Walk() {
        System.out.println("Walking on 4 legs.");
    }
}

class Chicken extends Animal {
    public void Walk() {
        System.out.println("Walking on 2 legs.");
    }
}

public class Abstraction {
    static void main() {
        Hourse h1 = new Hourse();
        h1.Walk();
        h1.eats();

    }
}
