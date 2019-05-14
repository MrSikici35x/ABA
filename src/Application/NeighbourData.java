package Application;

public class NeighbourData {

	private String countrySymbol;
	private String[] neighbours;
	
	public NeighbourData(String countrySymbol, String[] neighbours) {
		this.countrySymbol = countrySymbol;
		this.neighbours = neighbours;
	}

	public String getCountrySymbol() {
		return countrySymbol;
	}

	public void setCountrySymbol(String countrySymbol) {
		this.countrySymbol = countrySymbol;
	}

	public String[] getNeighbours() {
		return neighbours;
	}

	public void setNeighbours(String[] neighbours) {
		this.neighbours = neighbours;
	}
}
