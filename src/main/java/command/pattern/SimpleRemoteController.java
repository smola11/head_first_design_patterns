package command.pattern;

public class SimpleRemoteController {

    Command slot;

    public SimpleRemoteController() {
    }

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
