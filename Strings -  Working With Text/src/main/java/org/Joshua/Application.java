package org.Joshua;

public class Application {

    public static void main(String[] args) {

        // A String variable is a non-primitive type, which means it is an actual class for objects
        // String is the type/class, text is the location and identifier for the stored memory, "Hello" is the actual text object

        String text = "Hello";

       String blank = " ";

       String name = "Bob";

       // You can add strings together via concatenating ( Not sure on the spelling for this one)

       String greeting = text + blank + name;

       System.out.println(greeting);

       System.out.println("Hello" + " " + "Bob");
       System.out.println(text + blank + name);

       double myDouble = 7.8;

       System.out.println("My double is " + myDouble);


    }

}
