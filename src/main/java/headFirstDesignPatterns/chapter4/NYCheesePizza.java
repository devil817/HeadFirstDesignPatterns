package headFirstDesignPatterns.chapter4;

public class NYCheesePizza implements Pizza {
    public void prepare(){
        System.out.println("NYCheesePizza prepare");
    }
    public void bake(){
        System.out.println("NYCheesePizza prepare");
    }
    public void cut(){
        System.out.println("NYCheesePizza cut");
    }
    public void box(){
        System.out.println("NYCheesePizza box");
    }
}
