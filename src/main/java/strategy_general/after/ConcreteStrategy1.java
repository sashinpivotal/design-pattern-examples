package strategy_general.after;

public class ConcreteStrategy1 implements IStrategy {
	
	public String doSomething(String arg1, String arg2) {
		return (arg1 + arg2).toUpperCase();
	}
}