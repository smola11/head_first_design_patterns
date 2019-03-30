package pattern.of.pattens.combined.abstactFactory;

import pattern.of.pattens.combined.Quackable;

public abstract class AbstactDuckFactory {

    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}
