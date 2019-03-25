package pattern.of.pattens.ducks;

import pattern.of.pattens.Quackable;

public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
