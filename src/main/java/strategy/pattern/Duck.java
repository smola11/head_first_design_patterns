package strategy.pattern;

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


}
