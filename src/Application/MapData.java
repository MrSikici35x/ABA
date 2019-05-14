package Application;

public class MapData {

	private String countrySymbol;		//## attribute countrySymbol 
    
	private Point midPoint;		//## attribute midPoint 
    
    private int countryValue;		//## attribute countryValue 

	public MapData(String countrySymbol, int countryValue, Point midPoint) {
		this.countrySymbol = countrySymbol;
		this.midPoint = midPoint;
		this.countryValue = countryValue;
	}

	public String getCountrySymbol() {
		return countrySymbol;
	}

	public void setCountrySymbol(String countrySymbol) {
		this.countrySymbol = countrySymbol;
	}

	public Point getMidPoint() {
		return midPoint;
	}

	public void setMidPoint(Point midPoint) {
		this.midPoint = midPoint;
	}

	public int getCountryValue() {
		return countryValue;
	}

	public void setCountryValue(int countryValue) {
		this.countryValue = countryValue;
	}
}
