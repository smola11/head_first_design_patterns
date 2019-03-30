package pattern.of.pattens.MVC.adaptingHeartModel;

import pattern.of.pattens.MVC.model.BPMObserver;
import pattern.of.pattens.MVC.model.BeatObserver;

public interface HeartModelInterface {
    int getHeartRate();

    void registerObserver(BeatObserver o);

    void registerObserver(BPMObserver o);

    void removeObserver(BeatObserver o);

    void removeObserver(BPMObserver o);

}
