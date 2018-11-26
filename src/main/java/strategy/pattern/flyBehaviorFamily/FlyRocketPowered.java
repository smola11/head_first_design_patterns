package strategy.pattern.flyBehaviorFamily;

import strategy.pattern.flyBehaviorFamily.FlyBehaviour;

public class FlyRocketPowered implements FlyBehaviour {
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
