package info.runningstream;

public class EUR {
	String Currency;
    double Rate;
    String Symbol;
    
    @Override
    public String toString() {
    	
    	return (Currency + " - " + Rate + " - " + Symbol);  
    }

}
