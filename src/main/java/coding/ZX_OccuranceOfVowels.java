package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ZX_OccuranceOfVowels {
	

	public static void main(String[] args) throws IOException {
		
		System.out.print("Enter a String :: ");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		
		str = str.toLowerCase();
		char[] charArray = str.toCharArray();
		
		List<Character> cList = new ArrayList<Character>();
		for(char c : charArray) {
		    cList.add(c);
		}
		
		
		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
		map.put('a', Collections.frequency(cList, 'a'));
		map.put('e', Collections.frequency(cList, 'e'));
		map.put('i', Collections.frequency(cList, 'i'));
		map.put('o', Collections.frequency(cList, 'o'));
		map.put('u', Collections.frequency(cList, 'u'));
		
		for (Map.Entry e : map.entrySet() ) {
			System.out.println(e.getKey() + " --- " + e.getValue());
		}
	}
}
