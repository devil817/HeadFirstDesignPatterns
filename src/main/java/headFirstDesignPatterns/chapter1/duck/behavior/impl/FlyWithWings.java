package headFirstDesignPatterns.chapter1.duck.behavior.impl;

import headFirstDesignPatterns.chapter1.duck.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("Fly with wings");
    }
}
