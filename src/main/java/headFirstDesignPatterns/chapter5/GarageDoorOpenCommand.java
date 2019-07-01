package headFirstDesignPatterns.chapter5;

public class GarageDoorOpenCommand implements Command {
    private Garage garage;
    public GarageDoorOpenCommand(Garage receiver){
        this.garage = receiver;
    }
    public void execute(){
        garage.open();
    }
    public void undo(){
        garage.close();
    }
}
