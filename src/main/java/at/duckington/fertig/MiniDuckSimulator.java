package at.duckington.fertig;

import at.duckington.fertig.fly.FlyRocketPowered;
import at.duckington.fertig.pojos.Duck;
import at.duckington.fertig.pojos.MallardDuck;
import at.duckington.fertig.pojos.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

}