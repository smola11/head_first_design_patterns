package strategy.pattern;

import strategy.pattern.flyBehaviorFamily.FlyWithWings;
import strategy.pattern.quackBehaviorFamily.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
