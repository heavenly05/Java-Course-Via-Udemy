
// Setters. The opposite twin of the getter methods. They take in a parameter, and SET the instance variable to that parameter.
// Rather than setting the name by frog.name = "A name", you can call the setter method by frog.setName("A Name");

// This may seem redundant, but it allows you to not directly reference the instance variables. You may not want to remember them,...
// Or you cannot touch them due to everything being private or protected. This is why setters are VERY IMPORTANT

class Frog {

    String name;
    int age;

    // The other half of this lesson is the 'this' keyword. 'This' refers to the instance variables directly, so the parameter can have the same name as them.
    // This is useful because the parameter variable is local, and masks the instance variables. So by doing this.name, you can then avoid masking errors
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setInfo(String name, int age) {
        setName(name);
        setAge(age);
    }

}

public class Application {

    public static void main(String[] args) {

        Frog frog1 = new Frog();
         frog1.name = "Bertie";
         frog1.age = 1;

        System.out.println(frog1.getName());

        frog1.setName("Bradley");
        frog1.setAge(2);

        frog1.setInfo("Brudous", 3);

    }
}
