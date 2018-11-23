package strategy.pattern;

public class MiniDuckSimulatorMain {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
    }
}
