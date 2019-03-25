package pattern.of.pattens.abstactFactory;

import pattern.of.pattens.Quackable;
import pattern.of.pattens.ducks.DuckCall;
import pattern.of.pattens.ducks.MallardDuck;
import pattern.of.pattens.ducks.RedheadDuck;
import pattern.of.pattens.ducks.RubberDuck;

public class DuckFactory extends AbstactDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
