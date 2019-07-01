package headFirstDesignPatterns.chapter1.duck;

import headFirstDesignPatterns.chapter1.duck.behavior.FlyBehavior;
import headFirstDesignPatterns.chapter1.duck.behavior.QuackBehavior;

public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public void swim(){ //Do something
    }

    public abstract void display();

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
