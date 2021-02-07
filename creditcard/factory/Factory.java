package creditcard.factory;

import java.util.ArrayList;

public class Factory {
	

	private ArrayList<CreditCard> ccList = new ArrayList<CreditCard>();

	
	public String createCreditCard(String info) {
		String delimiter = ",";
		String[] attributes = info.split(delimiter);
		
		String creditCardNum = attributes[0];
		String expDate = attributes[1];
		String name = attributes[2];
		String end = attributes[3];
		String cardType = determineCardType(creditCardNum);
		
		if(cardType.equals("Visa")) {
			VisaCC cc = new VisaCC(creditCardNum, name, expDate);
			if(!ccList.contains(cc)) {
				ccList.add(cc);
			}
			return "Visa: " +  cc.toString();

		}
		else if(cardType.equals("MasterCard")) {
			MasterCC cc = new MasterCC(creditCardNum, name, expDate);
			if(!ccList.contains(cc)) {
				ccList.add(cc);
			}
			
			return "MasterCard: " +  cc.toString();
		}
		else if(cardType.equals("AmEx")) {
			AmExCC cc = new AmExCC(creditCardNum, name, expDate);
			if(!ccList.contains(cc)) {
				ccList.add(cc);
			}
			return "AmEx: " +  cc.toString();
		}
		else if(cardType.equals("Discover")) {
			DiscoverCC cc = new DiscoverCC(creditCardNum, name, expDate);
			if(!ccList.contains(cc)) {
				ccList.add(cc);
			}
			return "Discover: " +  cc.toString();
		}
		else return "invalid";
		
	}
	
	public String determineCardType(String creditCardNum) {
		
		
		int firstDigit = Integer.parseInt(creditCardNum.substring(0,1));
		int secondDigit = Integer.parseInt(creditCardNum.substring(1,2));
		String firstFour = creditCardNum.substring(0, 4);
		
		if((firstDigit == 2 || firstDigit == 5) && (secondDigit >= 1 && secondDigit <= 5) && creditCardNum.length() == 16) {
			return "MasterCard";
		}
		else if((firstDigit == 4) && (creditCardNum.length() == 13 || creditCardNum.length() == 16)) {
			return "Visa";
		}
		else if((firstDigit == 3) && (secondDigit == 4 || secondDigit == 7) && creditCardNum.length() == 15) {
			return "AmEx";
		}
		else if((firstFour.equals("6011")) && creditCardNum.length() == 16) {
			return "Discover";
		}
		else return "invalid";
	}
	
	
	

}
