package strategy.pattern;

import strategy.pattern.flyBehaviorFamily.FlyNoWay;
import strategy.pattern.quackBehaviorFamily.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        this.flyBehaviour = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
