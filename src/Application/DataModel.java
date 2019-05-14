package Application;

import java.util.ArrayList;

public class DataModel {

	private String titleText;

	private ArrayList<OutPutData> listOutPutData = new ArrayList<OutPutData>();

	private ArrayList<NeighbourData> listNeighbourData = new ArrayList<NeighbourData>();

	private ArrayList<MapData> listMapData = new ArrayList<MapData>();	

	

	public DataModel(String titleText, ArrayList<OutPutData> listOutPutData, ArrayList<NeighbourData> listNeighbourData, ArrayList<MapData> listMapData) {
		this.titleText = titleText;
		this.listOutPutData = listOutPutData;
		this.listNeighbourData = listNeighbourData;
		this.listMapData = listMapData;
	}

	public String getTitleText() {
		return titleText;
	}



	public void setTitleText(String titleText) {
		this.titleText = titleText;
	}



	public ArrayList<OutPutData> getListOutPutData() {
		return listOutPutData;
	}



	public void setListOutPutData(ArrayList<OutPutData> listOutPutData) {
		this.listOutPutData = listOutPutData;
	}



	public ArrayList<NeighbourData> getListNeighbourData() {
		return listNeighbourData;
	}



	public void setListNeighbourData(ArrayList<NeighbourData> listNeighbourData) {
		this.listNeighbourData = listNeighbourData;
	}



	public ArrayList<MapData> getListMapData() {
		return listMapData;
	}



	public void setListMapData(ArrayList<MapData> listMapData) {
		this.listMapData = listMapData;
	}



	public void calculateOutPutData() {

	}

	
	public void writeTextToTextFile(ArrayList<OutPutData> listOutPutData) 
	{
	        
	}
	
	public Double calculateRepulsiveFroce(Double RadiusOfFirstCountry, Double RadiusOfSecondCountry, Point midPointofFirstCountry,Point midPointofSecondCountry) {
		Double repulsiveFroce =  (RadiusOfFirstCountry + RadiusOfSecondCountry) - calculateDistanceBetweenTwoPoints(midPointofFirstCountry, midPointofSecondCountry);
		if(repulsiveFroce>0) {
			repulsiveFroce =  0.0;
		}
		return repulsiveFroce;
	}
	
	public Double calculateforceOfAttraction(Double RadiusOfFirstCountry, Double RadiusOfSecondCountry, Point midPointofFirstCountry,Point midPointofSecondCountry) {
		Double forceOfAttraction = calculateDistanceBetweenTwoPoints(midPointofFirstCountry, midPointofSecondCountry) - (RadiusOfFirstCountry + RadiusOfSecondCountry);
		if(forceOfAttraction>0) {
			forceOfAttraction = 0.0;
		}
		return forceOfAttraction;
	}
	
	public Double calculateDistanceBetweenTwoPoints(Point midPointofFirstCountry,Point midPointofSecondCountry) {
		Double distance = Math.hypot(midPointofFirstCountry.getxCoord()-midPointofSecondCountry.getxCoord(), midPointofFirstCountry.getyCoord()-midPointofSecondCountry.getyCoord());
		return distance;
	}
	
	public Double calculateRadius(Double circleArea) {
		Double pi = 3.14159;
		return Math.sqrt(circleArea / pi);
	}
}
