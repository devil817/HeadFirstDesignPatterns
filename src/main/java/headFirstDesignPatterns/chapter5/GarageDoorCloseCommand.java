package headFirstDesignPatterns.chapter5;

public class GarageDoorCloseCommand implements Command {
    private Garage garage;
    public GarageDoorCloseCommand(Garage receiver){
        this.garage = receiver;
    }
    public void execute(){
        garage.close();
    }
    public void undo(){
        garage.open();
    }
}
