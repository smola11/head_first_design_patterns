package pattern.of.pattens.MVC;

import pattern.of.pattens.MVC.controller.BeatController;
import pattern.of.pattens.MVC.controller.ControllerInterface;
import pattern.of.pattens.MVC.model.BeatModel;
import pattern.of.pattens.MVC.model.BeatModelInterface;

public class DJTestDrive {

    public static void main (String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }
}
