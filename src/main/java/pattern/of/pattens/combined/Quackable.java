package pattern.of.pattens.combined;

import pattern.of.pattens.combined.observer.QuackObservable;

public interface Quackable extends QuackObservable {
    void quack();
}
