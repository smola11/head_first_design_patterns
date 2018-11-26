package strategy.pattern.flyBehaviorFamily;

import strategy.pattern.flyBehaviorFamily.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {
    public void fly() {
        System.out.println("I can't fly");
    }
}
