package pattern.of.pattens.combined.abstactFactory;

import pattern.of.pattens.combined.Quackable;
import pattern.of.pattens.combined.decorator.QuackCounter;
import pattern.of.pattens.combined.ducks.DuckCall;
import pattern.of.pattens.combined.ducks.MallardDuck;
import pattern.of.pattens.combined.ducks.RedheadDuck;
import pattern.of.pattens.combined.ducks.RubberDuck;

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
