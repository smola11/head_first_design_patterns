package adapter.pattern.duckExample;

public class TestDriveMain {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
        testDuck(duck);
        testDuck(turkeyAdapter);

        // DuckAdapter test
        Turkey duckAdapter = new DuckAdapter(duck);

        for (int i = 0; i < 10; i++) {
            System.out.println("The DuckAdapter says...");
            duckAdapter.gobble();
            duckAdapter.fly();
        }
    }

    static void testDuck(Duck duck) {
        duck.fly();
        duck.quack();
    }
}
