package command.pattern.simpleCommand;

import command.pattern.simpleCommand.commands.GarageDoorOpenCommand;
import command.pattern.simpleCommand.commands.LightOnCommand;

public class RemoteControllerTestMain {

    public static void main(String[] args) {
        SimpleRemoteController remote = new SimpleRemoteController();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorUp = new GarageDoorOpenCommand(garageDoor);

        remote.setSlot(lightOn);
        remote.buttonWasPressed();
        remote.setSlot(garageDoorUp);
        remote.buttonWasPressed();
    }
}
