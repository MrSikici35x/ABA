package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		DataModel model = new DataModel("", new ArrayList<OutPutData>(), new ArrayList<NeighbourData>(), new ArrayList<MapData>());
		try {
			readIn(model);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//printList(model);
		System.out.println(model.calculateRadius(357.0));
	}

	private static void readIn(DataModel model) throws IOException {
		String fileName = "C:\\Users\\uid39752\\Desktop\\AbschlussTest\\Beispiel1.txt";
		String text = "";
		
		int counter = 0;
		int secondCounter = 0;
		
		
		BufferedReader readData = new BufferedReader(new FileReader(fileName));

		while ((text = readData.readLine()) != null) {
			
			if(counter == 0) {
				model.setTitleText(text);
				counter++;
			}
			if((text.contains("#")) && (counter != 0)) {
				secondCounter++;
			}else {
				if(secondCounter == 1) { // Means we read the first block of the Input file
					String[] parts = text.split(" ");
					Point midPoint = new Point(Double.parseDouble(parts[2]), Double.parseDouble(parts[3]));
					model.getListMapData().add(new MapData(parts[0], Integer.parseInt(parts[1]), midPoint));
				}
				if(secondCounter == 2) { // Means we read the second block of the Input file
					
					String[] parts = text.split(" ");
					
					
					int tempCounter = 0;
					int size = parts.length - 1;
					String[] tempArray = new String[size];
					
					for(int countNum = size; countNum > 0; countNum--) {
						tempArray[tempCounter] = parts[countNum];
						tempCounter++;
					}
					
					model.getListNeighbourData().add(new NeighbourData(parts[0].replace(":", ""), tempArray));
				}
			}
		}
		readData.close();
	}
	
//	private static void printList(DataModel model) { // Only used for Debugging
//		for (int i = 0; i < model.getListMapData().size(); i++) {
//			System.out.println(model.getListMapData().get(i).getCountrySymbol() +" "+ model.getListMapData().get(i).getCountryValue());
//		}
//	}
}
