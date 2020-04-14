package java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 * I am not the author of this code. 
 */

public class ZX_Collections {
	public static void main(String[] args) {

		// Collections of Data is in 2 different types
		// 1. 1 Dimensional Data
		// 1 Dimensional Data --> List/Set
		// List --> ArrayList and LinkedList
		// Set --> HashSet and TreeSet
		// 2. 2 Dimensional Data
		// Map --> HashMap and TreeMap

		// List --> ArrayList
		List<String> list = new ArrayList<String>();
		list.add("Thiru");
		list.add("Meenu");
		list.add(null);
		list.add(null);
		list.add("Veera");
		list.add("Thiru");
		System.out.println("Arraylist data output, it will allow multiple null values   : " + list);

		// List --> LinkedList
		List<String> list1 = new LinkedList<String>();
		list1.add("Thiru");
		list1.add("Meenu");
		list1.add("Veera");
		list1.add(null);
		list.add(null);
		list1.add("Thiru");
		System.out.println("LinkedList data output, it will allow only one null value : " + list1);

		// Set --> HashSet
		Set<String> set = new HashSet<String>();
		set.add("Thiru");
		set.add("Meenu");
		set.add("Veera");
		set.add(null);
		set.add(null);
		set.add("Thiru");
		System.out
				.println("HashSet data output, it won't allow duplicates, it will allow only one null value : " + set);

		// Set --> TreeSet
		Set<String> set1 = new TreeSet<String>();
		set1.add("Thiru");
		set1.add("Meenu");
		set1.add("Veera");
		set1.add("Thiru");
		System.out.println(
				"TreeSet data output, it won't allow duplicates,null values (null pointer exception) and output will be in Ascending order of input data : "
						+ set1);

		// Map --> HashMap and TreeMap
		// HashMap

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Thiru", 1);
		map.put("Meenu", 2);
		map.put("Veera", 2);
		map.put("Duplicate Integer", 1);
		map.put(null, 3);
		map.put("only Key", null);
		map.put("only Key", null);
		map.put("Thiru", 7);
		System.out.println(
				"HashMap data output, it will allow only one null key and multiple null values,if the first data is already there it will be overwritten "
						+ map);

		// TreeMap
		Map<String, Integer> map1 = new TreeMap<String, Integer>();
		map1.put("Thiru", 1);
		map1.put("Meenu", 2);
		map1.put("Veera", 2);
		map1.put("Duplicate Integer", 1);
		map1.put("Thiru", 7);
		map1.put("only Key", null);
		map1.put("Only Key1", null);
		System.out.println(
				"TreeMap data output, it will allow multiple null values but not keys, it won't allow duplicates,null values (null pointer exception) and output will be in Ascending order of input data : "
						+ map1);
	}

}
