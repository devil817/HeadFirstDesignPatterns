package headFirstDesignPatterns.chapter5;

import java.util.Arrays;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;
    public RemoteControl(){
        onCommands = new Command[]{new NoCommand(), new NoCommand()};
        offCommands = new Command[]{new NoCommand(), new NoCommand()};
    }

    public void setCommands(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand=onCommands[slot];
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand=offCommands[slot];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }
}
