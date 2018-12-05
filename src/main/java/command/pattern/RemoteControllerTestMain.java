package command.pattern;

public class RemoteControllerTestMain {

    public static void main(String[] args) {
        SimpleRemoteController remote = new SimpleRemoteController();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setSlot(lightOn);
        remote.buttonWasPressed();
    }
}
