package pattern.of.pattens.combined.observer;

import java.util.ArrayList;
import java.util.List;

// Helper object; Quackable object will delegate to it;
public class Observable implements QuackObservable {

    private List<Observer> observers = new ArrayList<>();
    private QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(duck);
        }
    }
}
