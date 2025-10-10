package dsascenario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeWithoutDuplicate {
	static List<Integer> mergeLists (List<Integer> lst1, List<Integer> lst2 ){
		List<Integer> mergedelements = new ArrayList<Integer>();
		
		for(int num : lst1) {
			if(!mergedelements.contains(num)) {
				mergedelements.add(num);
			}
		}
		
		for(int num : lst2) {
			if(!mergedelements.contains(num)) {
				mergedelements.add(num);
			}
		}
		
		return mergedelements;
	}
	public static void main(String[] args) {
		System.out.println(mergeLists(Arrays.asList(1, 2, 3),Arrays.asList(3, 4, 5) ));
	}
}
