package headFirstDesignPatterns.chapter4;

public class NYPizzaStore extends PizzaStore {
    public Pizza createPizza(String type){
        if( "cheese".equals(type) ){
            return new NYCheesePizza();
        }
        return null;
    }
}
