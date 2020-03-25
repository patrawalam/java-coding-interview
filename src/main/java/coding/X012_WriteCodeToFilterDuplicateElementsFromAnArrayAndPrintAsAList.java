package coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class X012_WriteCodeToFilterDuplicateElementsFromAnArrayAndPrintAsAList {
	
	public static void main(String[] args) {
		
		
		int[] testArray = {0,5,8,2,7,3,2,8,4,0,2,1,5,7,9,3,7,3,9, 6};	//Repeating elements 0,5,8,2,7,3 || Non repeating elements 1, 4, 6
		
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i: testArray)
			hs.add(i);
		//System.out.println(hs);
		
		List<Integer> cList = new ArrayList<Integer>();
		for(int c : testArray) {
		    cList.add(c);
		}
		//System.out.println(cList);
		
		HashSet<Integer> repeatingElement = new HashSet<Integer>();
		HashSet<Integer> nonRepeatingElement = new HashSet<Integer>();
		for(int i: hs) {
			if(Collections.frequency(cList, i) > 1)
				repeatingElement.add(i);
			else
				nonRepeatingElement.add(i);
		}
		System.out.println("Repeating elements in a Array :: "+repeatingElement);
		System.out.println("Non repeating elements in a Array :: "+nonRepeatingElement);
	}

}
