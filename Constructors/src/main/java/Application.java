// Constructors is a special method that is run everytime when a new instance of the class is created
// They are often used for the initialization of instance variables ( Set default values )

// You can overload constructor methods by having multiple with different parameters to do different things.

class Machine {

    private String name;
    private int code;
    // Constructors do not have any return type and must share the name of the class they are in. This makes them easy to find
    public Machine() {
        // You can call other constructors within a constructor using the 'this' keyword. It will find the...
        // constructor with whatever parameters fit what you gave it. However, it must be first line of the constructor
        // John explains that it is good practice to use the most complex constructor in the simpler ones,...
        // because it offers more parameters and flexibility
        this("Arnie", 0);

        System.out.println("Constructor Running");
    }

    public Machine(String name) {
        this(name, 0);

        System.out.println("Second constructor running");
    }

    public Machine(String name, int code) {
        System.out.println("Third constructor running");
        this.name = name;
        this.code = code;
    }


}

public class Application {

    public static void main(String[] args) {

        Machine machine1 = new Machine();
        Machine machine2 = new Machine("Bertie");
        Machine machine3 = new Machine("Robert", 7);

    }
}
