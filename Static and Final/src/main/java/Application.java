// Finally learned what the static keyword means. It means there will only be one copy of the variable or method for...
// The class as a whole. Each object does not get its own variable, it will share a static one.

// The reason the other variables are called instance variables is because each new instance of an object creates a new variable.
// Static methods can access static variables and cannot access instance variables

// Several uses for static is constants (such as Math.PI), counting how many objects there are, accessing methods without an object...
// or providing each object an ID value


class Thing {
    public String name;
    public static String description;
    public int id;

    public static final int LUCKY_NUMBER = 7;
    public static int count = 0;

    public Thing() {
        id = count;
        count++;
    }

    public void showName() {
        System.out.println(name);
    }

    public static void showInfo() {
        System.out.println(description);
    }

    public void getID() {
        System.out.println(id);
    }
}

public class Application {

    public static void main(String[] args) {

        Thing.description = "I am a thing";
        System.out.println(Thing.description);

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        thing1.name = "Bob";
        thing2.name = "Sue";

        thing1.showName();
        thing2.showName();

        Thing.showInfo();

        // Example of a class with constants
        System.out.println(Math.PI);

        // Our own constant value
        System.out.println(Thing.LUCKY_NUMBER);

        // Counting number of objects
        System.out.println("There are " + Thing.count + " things.");

        // Checking ID values of objects
        thing1.getID();
        thing2.getID();
    }
}
