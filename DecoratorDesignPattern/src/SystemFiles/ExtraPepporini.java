package SystemFiles;

public class ExtraPepporini implements ToppingDecorator{

    PizzaInterface pizza;

    public ExtraPepporini(PizzaInterface pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getPizzaPrice() {
        return this.pizza.getPizzaPrice()+350;
    }
}
