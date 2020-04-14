package codingchalleges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class TechGigCodeGladiatior_Problem2 {

	public static void main(String[] args) {
		
		/*
		 * src/main/java/TechGig - Code Gladiators - Problem 2.docx
		 */
		
		System.out.println("Enter information");
		Scanner scn = new Scanner (System.in);
		int testCases = Integer.parseInt(scn.nextLine());
		int noOfTeamMembers;
		ArrayList<Long> alTeamGRevolutionLong = null;
		ArrayList<Long> alOpponentLong = null;
		ArrayList<Long> alToGetMax;
		
		for(int i = 0;i<testCases;i++) {
			noOfTeamMembers = Integer.parseInt(scn.nextLine());
			
			alTeamGRevolutionLong = new ArrayList<Long>();
			for (String s: scn.nextLine().split("\\s+"))
				alTeamGRevolutionLong.add(Long.parseLong(s));
			
			alOpponentLong = new ArrayList<Long>();
			for (String s: scn.nextLine().split("\\s+"))
				alOpponentLong.add(Long.parseLong(s));

			
			
			alToGetMax = new ArrayList<Long>();
			
			Collections.sort(alOpponentLong, Collections.reverseOrder());
			//System.out.println(alOpponent);	//[9, 7, 6, 6, 6, 3, 2, 2, 0, 0]
			//System.out.println("********************");
			Iterator<Long> it = alOpponentLong.iterator();
			while(it.hasNext()) {
			
				Collections.sort(alTeamGRevolutionLong, Collections.reverseOrder());
				//System.out.println(alTeamGRevolution);
				if(alTeamGRevolutionLong.get(0) > it.next()) {
					alToGetMax.add(alTeamGRevolutionLong.get(0));
					alTeamGRevolutionLong.remove(0);
			}
				//System.out.println(alToGetMax);
		}
			System.out.println(alToGetMax.size());
		}
		
	}
}
