package coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class X008_DuplicateElementsInArray {

	public static void main(String[] args) {
		
		String[] arr = {"Hello", "how", "are", "Hello","you","doing","how","how","are"};
		
		//1. Using HashSet to only display duplicate elements
		HashSet <String> hs = new HashSet<String>();
		for (String s: arr) {
			if (hs.add(s) == false)
				System.out.println("Duplicate element found :: "+s);
		}
		
		System.out.println("--------------------------------------------------------------");
		
		
		
		//2. Using HashMap to display elements as well as how many times did it occur extra
		long start = System. currentTimeMillis();
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for(String s: arr) {
			Integer count = hm.get(s);
			if (count == null) {
				hm.put(s, 1);
			}
			else {
				hm.put(s, count+1);
			}
				
		}
		System.out.println("HashMap :: "+ hm);
		
		for (Map.Entry<String, Integer> e: hm.entrySet()) {
			if (e.getValue() > 1)
				System.out.println("The element \"" + e.getKey() + "\" is occuring \'" + (e.getValue() - 1) + "\' times extra");
		}
		long end = System. currentTimeMillis();
		
		System.out.println(start + " :: " + end + " :: " + (end-start));
		System.out.println("--------------------------------------------------------------");
		
		
		
		//3. Using ArrayList, HashSet, HashMap and Collections.frequency --- Fastest way
		 long newstart = System. currentTimeMillis();
		ArrayList<String> al = new ArrayList<String>();
		/*
		 * for(String s: arr) al.add(s);
		 */
		Collections.addAll(al, arr);
		
		HashSet<String> newHS = new HashSet<String>();
		/*
		 * for(String s: arr) newHS.add(s);
		 */
		Collections.addAll(newHS, arr);
		
		HashMap <String, Integer> newHM = new HashMap <String, Integer>();
		for (String s: newHS)
			newHM.put(s, Collections.frequency(al, s));
		System.out.println("HashMap :: "+ newHM);
		
		for (Map.Entry<String, Integer> es: newHM.entrySet()) {
			if (es.getValue() > 1)
				System.out.println("The element \"" + es.getKey() + "\" is occuring \'" + (es.getValue() - 1) + "\' times extra");
		}
		 long newend = System. currentTimeMillis();
		 System.out.println(newstart + " :: " + newend + " :: " + (newend-newstart));
	}

}
