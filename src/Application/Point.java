package Application;

public class Point {
	
	private Double xCoord;		//## attribute xCoord 
	    
	private Double yCoord;		//## attribute yCoord 

	public Point(Double xCoord, Double yCoord) {
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}

	public Double getxCoord() {
		return xCoord;
	}

	public void setxCoord(Double xCoord) {
		this.xCoord = xCoord;
	}

	public Double getyCoord() {
		return yCoord;
	}

	public void setyCoord(Double yCoord) {
		this.yCoord = yCoord;
	}
}
