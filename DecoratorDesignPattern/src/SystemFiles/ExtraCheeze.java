package SystemFiles;

public class ExtraCheeze implements ToppingDecorator{

    PizzaInterface pizza;

    public ExtraCheeze(PizzaInterface pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getPizzaPrice() {
        return this.pizza.getPizzaPrice()+ 200;
    }
}
