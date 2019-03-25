package pattern.of.pattens.abstactFactory;

import pattern.of.pattens.Quackable;
import pattern.of.pattens.decorator.QuackCounter;
import pattern.of.pattens.ducks.DuckCall;
import pattern.of.pattens.ducks.MallardDuck;
import pattern.of.pattens.ducks.RedheadDuck;
import pattern.of.pattens.ducks.RubberDuck;

public class CountingDuckFactory extends AbstactDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
