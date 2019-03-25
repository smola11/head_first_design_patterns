package pattern.of.pattens.composite;

import pattern.of.pattens.Quackable;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {

    private final List<Quackable> quackers = new ArrayList<>();

    @Override
    public void quack() {
        for (Quackable quackable : quackers) {
            quackable.quack();
        }
    }

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }
}
