package info.home;

public class Apprunner {

	public static void main(String[] args) {
		
		Currency dollar = new Currency("dollar", 2665, "$");
		Currency euro = new Currency("euro", 3015, "ª");
		Currency rub = new Currency("rub", 45, "P");
		
		
		/*
		Currency otheCur = new Currency();
	   
		otheCur.setName("funt");
		otheCur.setCourse(1234);
		otheCur.setSymbol("F");
		*/
    double dCourse = (double)dollar.getCourse()/100;
    double eCourse = (double)euro.getCourse()/100;
    double rCourse = (double)rub.getCourse()/100;
	String outString = "";
    outString = dollar.getName() + " " + dCourse + dollar.getSymbol() + "\n";
	outString = outString + euro.getName() + " " + eCourse + euro.getSymbol() + "\n";
	outString += rub.getName() + " " + rCourse + rub.getSymbol() + "\n";
	
	String changedString = getChangedString (outString);
    System.out.println(outString);
    System.out.println();
    System.out.println(changedString);
	}

	private static String getChangedString(String outString) {
		
		return null;
	}

}
