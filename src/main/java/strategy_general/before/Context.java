package strategy_general.before;

public class Context {

	public String doSomething(String algorithm, String arg1, String arg2) {
		
		String result ="";
		
		// BAD: every time a new algorithm is added, this code
		// needs to be modified - violation of Open-Closed principle
		switch (algorithm) {
		case "algorithm1":
			result = new Algorithm1().doSomething(arg1, arg2);
			break;
		case "algorithm2":
			result = new Algorithm2().doSomething(arg1, arg2);
			break;
		default:
			break;
		}
		
		return result;
	}
}
