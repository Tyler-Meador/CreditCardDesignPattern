package creditcard.factory;



public class AmExCC implements CreditCard{

	private String creditCard;
	private String name;
	private String expiration;

	
	
	
	public AmExCC(String creditCard, String name, String expiration) {
		this.creditCard = creditCard;
		this.name = name;
		this.expiration = expiration;
	}

	@Override
	public String createCreditCard(String creditCard) {
		return this.creditCard = creditCard;
		
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExpiration() {
		return expiration;
	}

	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}
	
	@Override
	public String toString() {
		return creditCard + "," + expiration + "," + name; 
	}

}
