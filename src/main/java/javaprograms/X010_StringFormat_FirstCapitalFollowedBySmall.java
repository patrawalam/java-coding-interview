package javaprograms;

import java.io.IOException;

public class X010_StringFormat_FirstCapitalFollowedBySmall {

	public static void main(String[] args) throws IOException {

		String returnString = "";
	      String s = "NyffsG";
	      String[] splittedStr = s.split("");
	      int ctr =  1;
	      for (int i=1;i<=splittedStr.length;i++){
	        ctr = 1;
	        if(i != splittedStr.length){
	          while(ctr <=i){
	          if(ctr == 1){
	            returnString = returnString + splittedStr[i-1].toUpperCase();
	            ctr++;
	          }
	          else
	          {
	            returnString = returnString + splittedStr[i-1];
	            ctr++;
	          }
	          
	        }
	          returnString = returnString + "-";
	       }
	        else {
	          while(ctr <=i){
	          if(ctr == 1){
	            returnString = returnString + splittedStr[i-1].toUpperCase();
	            ctr++;
	          }
	          else
	          {
	            returnString = returnString + splittedStr[i-1];
	            ctr++;
	          }
	          
	        }
	        }
	      }
	      
	      System.out.println(returnString);
	      
	    }
}
      