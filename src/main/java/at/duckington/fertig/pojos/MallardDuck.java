package at.duckington.fertig.pojos;

import at.duckington.fertig.fly.FlyWithWings;
import at.duckington.fertig.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I’m a real Mallard duck");
    }
}