package pattern.of.pattens.combined.observer;

public interface QuackObservable {

    void registerObserver(Observer observer);
    void notifyObservers();
}
