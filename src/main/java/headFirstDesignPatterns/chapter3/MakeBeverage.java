package headFirstDesignPatterns.chapter3;

public class MakeBeverage {
    public static void main(String args[]){
        Espresso espresso = new Espresso();
        Mocha mocha = new Mocha(espresso);
        System.out.println( mocha.getDescription() + " : " + mocha.cost() );
    }
}
