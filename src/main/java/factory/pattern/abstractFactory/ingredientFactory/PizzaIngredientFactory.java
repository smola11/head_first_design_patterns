package factory.pattern.abstractFactory.ingredientFactory;

import factory.pattern.abstractFactory.ingredients.Cheese;
import factory.pattern.abstractFactory.ingredients.Dough;
import factory.pattern.abstractFactory.ingredients.Sauce;

public interface PizzaIngredientFactory {
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();
}
