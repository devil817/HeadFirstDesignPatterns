package headFirstDesignPatterns.chapter5;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl(){
        super();
    }

    public void setCommand(Command command){
        this.slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
