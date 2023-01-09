// Parameters are extremely important when it comes to creating usable methods
// By passing a value into a method using the parameter, it will then do something utilizing that value.
// The output of the function will change depending on the inputted parameter, and that is the glory of method parameters.


class Robot {

    String name;

    public void speak(String text) {
        System.out.println(text);
    }

    public void jump(int height) {
        System.out.println("Jumping: " + height + " Meters");
    }

    public void move(String direction, double distance) {
        System.out.println("Moving: " + distance + " Meters in direction " + direction);
    }
}

public class Application {

    public static void main(String[] args) {

        Robot sam = new Robot();
        sam.name = "Sam";

        sam.speak("Hi I'm Sam");
        sam.jump(6);
        sam.move("west", 10.2);

        // You can pass variables into a method's parameters
        String greeting = "Hello there. I am ";
        sam.speak(greeting + sam.name);

        int value = 14;
        sam.jump(value);

        String direction = "North";
        double distance = 28.4;
        sam.move(direction, distance);

    }
}
