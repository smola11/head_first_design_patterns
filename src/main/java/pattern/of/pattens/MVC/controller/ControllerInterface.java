package pattern.of.pattens.MVC.controller;

public interface ControllerInterface {
    void start();

    void stop();

    void setBPM(int bpm);

    void increaseBPM();

    void decreaseBPM();
}
