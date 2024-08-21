package com.sprintrunner;

public class Greet {
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public String sayHello(String name) {
            if (name != null && !name.trim().isEmpty()) {
            return "Hello " + name;
        } else {
            return "Hello World!";
        }
    }
}

