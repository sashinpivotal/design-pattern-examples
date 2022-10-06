package strategy_payment.before;

public class Paypal  {

	private String emailId;
	private String password;

	public Paypal(String email, String pwd) {
		this.emailId = email;
		this.password = pwd;
	}

	public void pay(int amount) {
		System.out.println(amount + " dollars paid using Paypal.");
	}

}
