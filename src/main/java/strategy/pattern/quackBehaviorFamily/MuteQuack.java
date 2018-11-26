package strategy.pattern.quackBehaviorFamily;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
