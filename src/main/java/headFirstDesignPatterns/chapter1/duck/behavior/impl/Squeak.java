package headFirstDesignPatterns.chapter1.duck.behavior.impl;

import headFirstDesignPatterns.chapter1.duck.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
