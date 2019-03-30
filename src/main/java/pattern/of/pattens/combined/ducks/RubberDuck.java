package pattern.of.pattens.combined.ducks;

import pattern.of.pattens.combined.Quackable;
import pattern.of.pattens.combined.observer.Observable;
import pattern.of.pattens.combined.observer.Observer;

public class RubberDuck implements Quackable {

    private Observable observable;

    public RubberDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    public String toString() {
        return "Rubber Duck";
    }
}
