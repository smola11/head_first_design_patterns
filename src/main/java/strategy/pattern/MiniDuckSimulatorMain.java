package strategy.pattern;

import strategy.pattern.flyBehaviorFamily.FlyRocketPowered;

public class MiniDuckSimulatorMain {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
    }
}
