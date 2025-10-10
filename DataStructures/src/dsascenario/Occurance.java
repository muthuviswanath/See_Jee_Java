package dsascenario;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Occurance {
	static Map<String, Integer> countFrequency (List<String> mylist){
		Map<String, Integer> frequencyMap = new HashMap<String, Integer>();
		for (String str : mylist) {
			if(frequencyMap.containsKey(str)) {
				frequencyMap.put(str, frequencyMap.get(str) + 1);
			}
			else {
				frequencyMap.put(str, 1);
			}
		}
		return frequencyMap;
	}
	
	public static void main(String[] args) {
		System.out.println(countFrequency(Arrays.asList("cat", "dog", "cat", "dog", "cat") ));
		System.out.println(countFrequency(Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple") ));
	}
}
