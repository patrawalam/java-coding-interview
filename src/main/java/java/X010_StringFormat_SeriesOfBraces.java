package java;

public class X010_StringFormat_SeriesOfBraces {

	public static void main(String[] args) {
		
		//"(", ")" --> Invalid
		//"()" --> Valid
		//"(())((()())())" --> Complex

		boolean result = false;
	    String braces = "(())((()())())";
	    String[] bracesArr = braces.split("");
	    int lengthOfBraces = bracesArr.length;
	    if(bracesArr[0] != "(")
	      result = false;
	    
	     if(bracesArr[lengthOfBraces-1] != ")")
	       result = false;
	    
	    int countStartBraces = 0;
	    int countEndBraces = 0;
	    
	    for (String s: bracesArr){
	      if (s.equals("("))
	        countStartBraces++;
	    }
	    
	    for (String s: bracesArr){
	      if (s.equals(")"))
	        countEndBraces++;
	    }
	    
	    if(countStartBraces != countEndBraces)
	      result = false;
	      
	    int counterOpenAndClose = 0;
	      for (String s: bracesArr){
	        if (s.equals("("))
	          counterOpenAndClose++;
	        else if (s.equals(")"))
	          counterOpenAndClose--;
	      }
	    if (counterOpenAndClose == 0)
	      result = true;
	    
	    System.out.println(result);
	  }
	

}
