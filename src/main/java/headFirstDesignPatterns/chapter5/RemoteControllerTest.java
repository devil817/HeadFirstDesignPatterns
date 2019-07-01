package headFirstDesignPatterns.chapter5;

public class RemoteControllerTest {
    public static void main(String[] args){
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        Garage garage = new Garage();
        remoteControl.setCommands(0, new LightOnCommand(light), new LightOffCommand(light) );
        remoteControl.setCommands(1, new GarageDoorOpenCommand(garage), new GarageDoorCloseCommand(garage) );
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();
    }
}
