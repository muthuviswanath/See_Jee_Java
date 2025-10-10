package dsascenario_two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Problem Statement: 
 * Given an array of integers, partition it into two subsets such that the absolute 
 * difference between the sums of the two subsets is minimized.
 * */
public class ArrayPartitionMinDiff {
/**
 * @param array input array (non negative integer)
 * @return a pair containing (minDifference, subset A, subset B)
 * 
 */
	public static Result partition(int [] arr) {
		int n = arr.length;
		int total = 0;
		for (int val : arr) total += val;
		
		int target = total;
		
		boolean[][] cr = new boolean[n+1][target+1];
		for(int i=0;i<=n;i++) cr[i][0] = true;
		
		for (int i = 1; i<= n; i++) {
			int val = arr[i-1];
			for(int s=0; s<=target; s++) {
				if(cr[i-1][s]) {
					cr[i][s]= true;
				}
				else {
					if (s >= val && cr[i-1][s-val]) {
						cr [i][s] = true;
					}
					else {
						cr[i][s] = false;
					}
				}
			}
		}		
		int bestsum = 0;
		int bestDiff = Integer.MAX_VALUE;
		
		for(int i=0; i<= target;i++) {
			if(!cr[n][i]) continue;
			int diff = Math.abs(total - 2 * i);
			if(diff < bestDiff) {
				bestDiff = diff;
				bestsum = i;
			}
			else if (diff == bestDiff && i > bestsum) {
				bestsum = i;
			}
			
		}
		
		//find the minimum difference
		int minDiff = bestDiff;
		
		List<Integer> subsetA = new ArrayList<Integer>();
		int s = bestsum;
		for (int i =n; i>=1; i--) {
			if(cr[i-1][s]) continue;
			else {
				subsetA.add(arr[i-1]);
				s -= arr[i-1];
			}
		}
		
		Collections.reverse(subsetA);
		
		List<Integer> subsetB = new ArrayList<Integer>();
		Map<Integer, Integer> takenset = new HashMap<Integer, Integer>();
		for(int i : subsetA) takenset.put(i, takenset.getOrDefault(i, 0)+1);
		
		for (int val : arr) {
			Integer count = takenset.get(val);
			if(count != null && count>0) {
				takenset.put(val, count-1);
			}
			else subsetB.add(val);
		}
		return new Result(minDiff, subsetA, subsetB);
	}


	public static class Result{
		public int minDiff;
		public List<Integer> subsetA;
		public List<Integer> subsetB;
		
		public Result(int minDiff, List<Integer> subsetA, List<Integer> subsetB) {
			this.minDiff = minDiff;
			this.subsetA = subsetA;
			this.subsetB = subsetB;
		}
	} 
	
	public static void main(String[] args) {
		int[] arr = {2,1,8,4,2,6};
		Result res = partition(arr);
		System.out.println("Input: " + Arrays.toString(arr));
		System.out.println("Minimum Difference: " + res.minDiff);
		System.out.println("Subsets: " + res.subsetA + " and " + res.subsetB);
		
	}
}


