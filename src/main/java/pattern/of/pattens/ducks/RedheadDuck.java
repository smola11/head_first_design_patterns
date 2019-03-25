package pattern.of.pattens.ducks;

import pattern.of.pattens.Quackable;

public class RedheadDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
