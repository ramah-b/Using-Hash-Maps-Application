package hashmapPackage;

import java.util.HashMap;

public class IntValueHashmap {
	HashMap<Integer, String> myMap = new HashMap<Integer, String>();
	
	public IntValueHashmap(){
		
	myMap.put(0, "Zero");
	myMap.put(1, "One");
	myMap.put(2, "Two");
	myMap.put(3, "Three");
	myMap.put(4, "Four");
	myMap.put(5, "Five");
	myMap.put(6, "Six");
	myMap.put(7, "Seven");
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
}
