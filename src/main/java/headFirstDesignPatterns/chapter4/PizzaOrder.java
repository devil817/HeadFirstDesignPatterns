package headFirstDesignPatterns.chapter4;

public class PizzaOrder {
    public static void main(String[] args){
        PizzaStore store = new NYPizzaStore();
        store.orderPizza("cheese");
    }
}
