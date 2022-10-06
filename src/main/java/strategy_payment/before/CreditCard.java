package strategy_payment.before;

public class CreditCard  {

	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;

	public CreditCard(String nm, String ccNum, String cvv, String expiryDate){
		this.name=nm;
		this.cardNumber=ccNum;
		this.cvv=cvv;
		this.dateOfExpiry=expiryDate;
	}
	
	public void pay(int amount) {
		System.out.println(amount +" dollars paid with credit/debit card");
	}

}
