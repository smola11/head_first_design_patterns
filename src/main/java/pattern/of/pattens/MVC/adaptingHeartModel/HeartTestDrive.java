package pattern.of.pattens.MVC.adaptingHeartModel;

import pattern.of.pattens.MVC.controller.ControllerInterface;

public class HeartTestDrive {
    public static void main (String[] args) {
        HeartModel heartModel = new HeartModel();
        ControllerInterface model = new HeartController(heartModel);
    }
}
