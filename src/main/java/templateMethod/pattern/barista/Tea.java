package templateMethod.pattern.barista;

public class Tea extends CaffeineBeverage {
    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }
}
