package Application;

public class OutPutData {

	private String countrySymbol;		//## attribute countrySymbol 
    
	private int countryID;		//## attribute countryID 
    
	private double radius;		//## attribute radius 
    
	private Point midPoint;		//## attribute midPoint 

	public OutPutData(String countrySymbol, int countryID, double radius, Point midPoint) 
	{
		this.countrySymbol = countrySymbol;
		this.countryID = countryID;
		this.radius = radius;
		this.midPoint = midPoint;
	}

	public String getCountrySymbol() {
		return countrySymbol;
	}

	public void setCountrySymbol(String countrySymbol) {
		this.countrySymbol = countrySymbol;
	}

	public int getCountryID() {
		return countryID;
	}

	public void setCountryID(int countryID) {
		this.countryID = countryID;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Point getMidPoint() {
		return midPoint;
	}

	public void setMidPoint(Point midPoint) {
		this.midPoint = midPoint;
	}

}
