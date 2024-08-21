package com.sprintrunner;
import com.sprintrunner.Greet;
/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Greet greet = new Greet();
        greet.sayHello();
    }
}

