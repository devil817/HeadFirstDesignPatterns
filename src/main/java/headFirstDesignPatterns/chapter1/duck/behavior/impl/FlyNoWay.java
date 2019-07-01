package headFirstDesignPatterns.chapter1.duck.behavior.impl;

import headFirstDesignPatterns.chapter1.duck.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("FlyNoWay");
    }
}
