package info.runningstream;

public class Runingstream {

	 static USD usd = new USD();
	 static EUR eur = new EUR();
	 static RUB rub = new RUB();
		
	public static void main(String[] args) {
				
	usd.Currency = "USD";
	usd.Rate = 25.5;
	usd.Symbol = "$";
	
	eur.Currency = "EUR";
	eur.Rate = 30;
	eur.Symbol = "E";
	
	rub.Currency = "RUB";
	rub.Rate = 1.22;
	rub.Symbol = "R";
	
	
		System.out.print(usd+ " ; " + eur + " ; " + rub);
	

	}

}
