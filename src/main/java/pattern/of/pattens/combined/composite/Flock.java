package pattern.of.pattens.combined.composite;

import pattern.of.pattens.combined.Quackable;
import pattern.of.pattens.combined.observer.Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable {

    private List<Quackable> ducks = new ArrayList<Quackable>();

    public void add(Quackable duck) {
        ducks.add(duck);
    }

    public void quack() {
        ducks.forEach(Quackable::quack);
    }

    public void registerObserver(Observer observer) {
        Iterator<Quackable> iterator = ducks.iterator();
        while (iterator.hasNext()) {
            Quackable duck = (Quackable)iterator.next();
            duck.registerObserver(observer);
        }
    }

    public void notifyObservers() { }

    public String toString() {
        return "Flock of Ducks";
    }
}
