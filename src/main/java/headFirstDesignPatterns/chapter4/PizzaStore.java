package headFirstDesignPatterns.chapter4;

public abstract class PizzaStore {
    Pizza pizza;
    public abstract Pizza createPizza(String type);
    public void orderPizza(String type){
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
