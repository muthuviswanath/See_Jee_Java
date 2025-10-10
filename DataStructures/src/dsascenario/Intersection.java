package dsascenario;

import java.util.HashSet;
import java.util.Set;

public class Intersection {
	public static Set<Integer> findSetIntersection(Set<Integer> set1, Set<Integer> set2){
		Set<Integer> intersect = new HashSet<Integer>();
		for(int num : set1) {
			if(set2.contains(num)) {
				intersect.add(num);
			}
			
		}
		return intersect;
	}
	
	public static void main(String[] args) {
		System.out.println(findSetIntersection(Set.of(1, 2, 3, 4), Set.of(3,4,5,6)));
	}
}
