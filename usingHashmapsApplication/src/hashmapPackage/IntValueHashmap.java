package hashmapPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

public class IntValueHashmap {
	HashMap<Integer, String> myMap = new HashMap<Integer, String>();
	
	public IntValueHashmap(){
		
		this.readNumberValue();
	}
	
	public void setMyMap(int key, String value){
		myMap.put(key, value);
	}
	public boolean getMyMap(int key){
		
		boolean found = false;
		
		if (myMap.containsKey(key)){
			found = true;
			this.printValue(myMap.get(key));
			return  found;
		}
		else {
			return found;
			} 
	}

	public void printValue(String value){
		System.out.println("You entered " + value +".");
	}
	
	private void readNumberValue(){
		
		//System.out.println("read from a file");
		String filename = (System.getProperty("user.dir") + File.separatorChar +"hashmaps.txt");
		BufferedReader reader = null;
		
		try {
			reader = new BufferedReader(new FileReader(filename));
			String line = reader.readLine();
			while (line != null) {
				//System.out.println(line);
				String[] number_value_pair = line.split("\t");
				myMap.put(Integer.parseInt(number_value_pair[0]), number_value_pair[1]);
				
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("File does not exist!");
		}
	}
	
	public void writeNumberValue(){
	    //System.out.println("writing keys and values to a file");
	    String filename = (System.getProperty("user.dir") + File.separatorChar +"hashmaps.txt");
		//System.out.println(filename);
	        
	    PrintWriter writer = null;
		try {
			writer = new PrintWriter(new File(filename));
			System.out.println("File was saved successfully.");
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist!");
		}
		
		//print both the key and the value on same line
		// for each key in the key set write the key, a tab and the value
		for (int key : myMap.keySet()) {
			//System.out.println("write this line: " + key);
	    	writer.println(key + "\t" + myMap.get(key));
	    }
		writer.close();
	}

}
