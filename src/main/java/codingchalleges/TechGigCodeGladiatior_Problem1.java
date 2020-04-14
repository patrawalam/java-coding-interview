package codingchalleges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class TechGigCodeGladiatior_Problem1 {

	public static void main(String[] args) {
		
		/*
		 * src/main/java/TechGig - Code Gladiators - Problem 1 (No problem available in document
		 * It was related to Powerpuff girls required to be created
		 * Using Ingredients
		 */
		
		System.out.println("Enter information");
		Scanner scn = new Scanner (System.in);
	    String noOfIngredients = scn.nextLine();
	    ArrayList<String> ingredientToMakeGirl = new ArrayList<String>();
	    ArrayList<String> ingredientPresentInLab = new ArrayList<String>();
	    ingredientToMakeGirl.addAll(Arrays.asList(scn.nextLine().split("\\s+")));
	    ingredientPresentInLab.addAll(Arrays.asList(scn.nextLine().split("\\s+")));
	    ArrayList<Long> resultAL = new ArrayList<Long>();

	    //int sizeOfList = ingredientToMakeGirl.size();
	    //System.out.println(ingredientToMakeGirl);	//[2, 5, 6, 3]
	    //System.out.println(ingredientPresentInLab);	//[20, 40, 90, 50]
	    //System.out.println(sizeOfList);
	    Iterator<String> itrIngredientToMakeGirl = ingredientToMakeGirl.iterator();
	    Iterator<String> itrIngredientPresentInLab = ingredientPresentInLab.iterator();
	    while (itrIngredientToMakeGirl.hasNext() && itrIngredientPresentInLab.hasNext()) {
	    	//System.out.println(Long.parseLong(itrIngredientPresentInLab.next()) + " --- "+ Long.parseLong(itrIngredientToMakeGirl.next()) + 
	    	//		" --- " + Long.parseLong(itrIngredientPresentInLab.next()) / Long.parseLong(itrIngredientToMakeGirl.next()));
	    	//System.out.println(Long.parseLong(itrIngredientPresentInLab.next()) / Long.parseLong(itrIngredientToMakeGirl.next()));
	    	resultAL.add(Long.parseLong(itrIngredientPresentInLab.next()) / Long.parseLong(itrIngredientToMakeGirl.next()));
	    	//System.out.println(resultAL);
	    }
	    	//System.out.println(resultAL);
	    	Collections.sort(resultAL);
	    	System.out.println(resultAL.get(0));
		
	}
}
