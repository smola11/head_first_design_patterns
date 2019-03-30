package pattern.of.pattens.MVC.adaptingHeartModel;

import pattern.of.pattens.MVC.controller.ControllerInterface;
import pattern.of.pattens.MVC.view.DJView;

public class HeartController implements ControllerInterface {
    private HeartModelInterface model;
    private DJView view;

    public HeartController(HeartModelInterface model) {
        this.model = model;
        view = new DJView(this, new HeartAdapter(model));
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.disableStartMenuItem();
    }

    public void start() {}

    public void stop() {}

    public void increaseBPM() {}

    public void decreaseBPM() {}

    public void setBPM(int bpm) {}
}
