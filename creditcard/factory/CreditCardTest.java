package creditcard.factory;

public class CreditCardTest {

	public static void main(String[] args) {
		
		
		String[] lines = {"5100123412341234,07/22,John Doe, x"};

		Factory ccFactory = new Factory();
		
		for( int i = 0; i < lines.length; i++) {
			System.out.println(ccFactory.createCreditCard(lines[i]));
		}
	
	}
}
