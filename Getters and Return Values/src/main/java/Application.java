
/*
* This lesson focuses on getters and return values. Getters are SUPER IMPORTANT when it comes to java classes. It allows other classes and methods...
* to gain access to the different instance variables and their values.
*
* Just remember the pain you went through trying to pass the drivetrain subsystem to the autonomous command because you didn't know about getter methods.
* THANK YOU TEAM 2910 FOR THE HELP!
*
* Return values dictate what the method will do.
* - Void: Does not return any value. Very useful to just execute some code
* - Int: Returns an integer value
* - String: Returns a String
* - Double: Returns a double...
*
* You get what I'm saying. Match what you want to be returned with the return type and boom
* */

class Person {
    String name;
    int age;

    void speak() {
        System.out.println("My name is " + name);
    }

    int calculateYearsToRetirement() {
        return 65 - age;
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }

}

public class Application {

    public static void main(String[] args) {

        Person person1 = new Person();

        person1.name = "Joe";
        person1.age = 25;

        person1.speak();
        person1.calculateYearsToRetirement();

        int years = person1.calculateYearsToRetirement();
        System.out.println(years);

        int age = person1.getAge();
        System.out.println(age);

        String name = person1.getName();
        System.out.println(name);
    }
}
