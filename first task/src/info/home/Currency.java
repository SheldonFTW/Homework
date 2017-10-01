package info.home;

public class Currency {

	private String name;
	private int course;
	private String symbol;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	
			
	}
	public Currency(String name, int course, String symbol) {
		super();
		this.name = name;
		this.course = course;
		this.symbol = symbol;
	}
	
public Currency() {

}
}
