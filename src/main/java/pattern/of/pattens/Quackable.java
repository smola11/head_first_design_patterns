package pattern.of.pattens;

import pattern.of.pattens.observer.QuackObservable;

public interface Quackable extends QuackObservable {
    void quack();
}
