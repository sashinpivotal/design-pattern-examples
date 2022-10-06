package strategy_general.after;

public class Context {

    // GOOD: This code does not need to be modified
    // because strategy is now injected during runtime
    private IStrategy strategy;

    public Context(IStrategy strategy) {

        this.strategy = strategy;
    }

    public String executeStrategy(String arg1, String arg2) {

        return strategy.doSomething(arg1, arg2);
    }
}
