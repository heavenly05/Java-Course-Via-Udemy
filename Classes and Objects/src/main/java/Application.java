// You can only have one public class per file, however you can have as many private classes as you want.

// A person class holds and represents the attributes a person object would have. Then using the class as a blueprint, you can then create unique person objects
class Person {

    /* Classes can contain...
    *  1. Data
    *  2. Subroutines (methods)
    */

    // Data is referred to as instance variables, or "state"

    String name;
    int age;


}

public class Application {

    public static void main(String[] args) {

        // Classes and objects are the BACKBONE of object-oriented programming and java in general

        //Create a new person object
        Person person1 = new Person();

        person1.name = "Joe Bloggs";
        person1.age = 37;

        Person person2 = new Person();

        person2.name = "Sarah Smith";
        person2.age = 20;

        // To access instance variables or subroutines of a class, a dot (period, .) is used.


    }
}
