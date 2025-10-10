package dsascenario_two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class StringPermutation {

	public static List<String> generatePermutation(String s, List<String> forbidden){
		Map<Character, Integer> count = new TreeMap<Character, Integer>();
		for (char c: s.toCharArray()) count.put(c,count.getOrDefault(c, 0)+1);
		
		Set<String> result = new LinkedHashSet<String>();
		StringBuilder sb = new StringBuilder();
		backtrack(sb,s.length(), count, forbidden, result);
		return new ArrayList<String>(result);
	}

	private static void backtrack (StringBuilder sb, int targetLen,
			Map<Character, Integer> count,
			List<String> forbidden,
			Set<String> result) {

		if(sb.length() == targetLen) {
			result.add(sb.toString());
			return;
		}

		for(Map.Entry<Character, Integer> e : count.entrySet()) {
			char c = e.getKey();
			int remaining = e.getValue();

			if (remaining == 0) continue;

			int n = sb.length();
			if(n >= 2 && sb.charAt(n-1) == c && sb.charAt(n-2) == c) {
				continue;
			}

			sb.append(c);
			count.put(c,remaining-1);

			boolean violatesForbidden = false;
			for(String forb : forbidden) {
				int flen = forb.length();
				if (sb.length() >= flen) {
					boolean endsWith = true;
					for(int i=0; i<flen;i++) {
						if(sb.charAt(sb.length() - flen + i) != forb.charAt(i)) {
							endsWith = false;
							break;
						}
					}

					if(endsWith) {
						violatesForbidden = true;
						break;
					}
				}
			}
			if(!violatesForbidden) {
				backtrack(sb,targetLen, count, forbidden, result);
			}

			sb.deleteCharAt(sb.length()-1);
			count.put(c, remaining);
		}

	}

	public static void main(String[] args) {
		String s= "aabb";
		List<String> forbiddenSubstrings = Arrays.asList("ab","ba");
		List<String> permutations = generatePermutation(s, forbiddenSubstrings);
		System.out.println("Valid Permutations: ");
		System.out.println("Forbidden: " + forbiddenSubstrings);
		System.out.println(permutations);
		
		
	}

}
