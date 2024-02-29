package at.duckington.fertig.pojos;

import at.duckington.fertig.fly.FlyNoWay;
import at.duckington.fertig.quack.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    public void display() {
        System.out.println("I’m a model duck");
    }


}