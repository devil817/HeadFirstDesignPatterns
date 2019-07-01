package headFirstDesignPatterns.chapter5;

public class NoCommand implements Command {
    public void execute(){
        System.out.println("No Command");
    }
    public void undo(){
        System.out.println("Dose not something");
    }
}
