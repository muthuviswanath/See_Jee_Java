import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapInterface {
// It contains the data in the form of key and value pair
// Each key and value pair is called as entry
// A map contains unique keys
// HashMap, LinkedHashMap allows null keys
// TreeMap doesnt allow null keys
// Value can be duplicated
// A Map cannot be traversed like other collections

	public static void main(String[] args) {
		HashMap<Integer, String> jersey = new HashMap<Integer, String>();
		jersey.put(10, "Sachin");
		jersey.put(18, "Raghu");
		jersey.put(45, "Vivek");
		jersey.put(null, null);
		jersey.put(99, null);
		jersey.put(89, null);
		jersey.put(19, null);
		System.out.println(jersey);
		jersey.putIfAbsent(45,"Rohit");
		System.out.println(jersey);
		System.out.println(jersey.keySet());
		System.out.println(jersey.values());
		
		//Iterating map using entryset in foreach loop
		for(Map.Entry<Integer,String> entry:jersey.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		//Iterating the map through keyset
		for(Integer key: jersey.keySet()) {
			System.out.println(key +" : " + jersey.get(key));
		}
		
		//Iterating the map for values alone
		
		for(String val : jersey.values()) {
			System.out.println(val);
		}
		
		//using streams and lambda expression
		jersey.forEach((key,value) -> {
			System.out.println(key +" : " + value);
		});
		
		//Iterator
		
		Iterator<Map.Entry<Integer, String>> mapiter = jersey.entrySet().iterator();
		while(mapiter.hasNext()) {
			Entry e = mapiter.next();
			System.out.println(e.getKey() +" : " + e.getValue());
		}
		
		//Stream APIs (functional)
		jersey.entrySet()
				.stream()
				.forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
	}
}
