package strategy_payment.before;

public class CreditCard  {

	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;

	public CreditCard(String name, String ccNum, String cvv, String expiryDate){
		this.name=name;
		this.cardNumber=ccNum;
		this.cvv=cvv;
		this.dateOfExpiry=expiryDate;
	}
	
	public void pay(int amount) {

		System.out.println(amount +" dollars paid with credit card");
	}

}
