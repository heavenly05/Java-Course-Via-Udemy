
class Person {
    String name;
    int age;

    // Methods, or functions are chunks of code that run when called. main method is just ...
    // ...that. When the program starts, it will automatically call for the main method to be run, and it does whatever is inside it

    // Methods will usually have the return type of void, or no return. This means that it will just execute the code and do nothing else
    // the () are where your parameters will go into
    void speak() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }

    void sayHelloTo(String otherPerson) {
        System.out.println("Hello there " + otherPerson + ", I am " + name + ".");
    }
}

public class Application {

    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person();

        person1.name = "Joe Bloggs";
        person1.age = 37;

        person2.name = "Sarah Smith";
        person2.age = 20;

        person1.speak();
        person2.speak();

        person1.sayHelloTo(person2.name);

    }
}
