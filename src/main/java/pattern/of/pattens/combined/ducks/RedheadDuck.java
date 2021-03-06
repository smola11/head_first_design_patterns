package pattern.of.pattens.combined.ducks;

import pattern.of.pattens.combined.Quackable;
import pattern.of.pattens.combined.observer.Observable;
import pattern.of.pattens.combined.observer.Observer;

public class RedheadDuck implements Quackable {

    private Observable observable;

    public RedheadDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
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
        return "Redhead Duck";
    }
}
