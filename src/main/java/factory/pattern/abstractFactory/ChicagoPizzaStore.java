package factory.pattern.abstractFactory;

import factory.pattern.abstractFactory.ingredientFactory.ChicagoPizzaIngredientFactory;
import factory.pattern.abstractFactory.ingredientFactory.PizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {

    Pizza pizza = null;
    PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");

        } else if (item.equals("veggie")) {

            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");

        }
        return pizza;
    }
}
