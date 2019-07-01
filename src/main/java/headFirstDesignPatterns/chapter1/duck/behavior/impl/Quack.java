package headFirstDesignPatterns.chapter1.duck.behavior.impl;

import headFirstDesignPatterns.chapter1.duck.behavior.QuackBehavior;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
