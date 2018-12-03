package factory.pattern.abstractFactory.ingredientFactory;

import factory.pattern.abstractFactory.ingredients.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ParmesanCheese();
    }
}
