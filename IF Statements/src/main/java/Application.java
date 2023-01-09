public class Application {
    public static void main(String[] args) {

        int myInt = 5;

        /*
        * If statements only run if the condition is true.
        * else if statements only run if all conditions above them are false, and that one is true.
        * ( Pretty much saying if the first if is true, the second else-if will be ignored)
        * else will run when nothing else is true, and does not have any conditions attached to it.
        */

        if(myInt < 10) {
            System.out.println("Yes, it is true!");
        }
        else if(myInt > 20){

        }
        else {
            System.out.println("No, it is false!");
        }

        // If statements can be used in conjunction with any other loops for an infinite amount of purposes.
        //However, one purpose is to break out of an infinite loop using the break keyword.
        //The break keyword breaks out of any loop it is currently within. Very useful to know

        int loop = 0;

        while(true) {
            System.out.println("Looping: " + loop);
            if (loop == 5){
                break;
            }
            loop++;
        }

    }
}
