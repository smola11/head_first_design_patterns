package strategy.pattern;

import strategy.pattern.flyBehaviorFamily.FlyBehaviour;
import strategy.pattern.quackBehaviorFamily.QuackBehavior;

public abstract class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehavior quackBehavior;

    // Abstract class can have a constructor
    public Duck() {
    }

    public abstract void display();

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void performFly() {
        this.flyBehaviour.fly();
    }

    public void performQuack() {
        this.quackBehavior.quack();
    }


    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
