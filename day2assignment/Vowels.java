package day2assignment;

public class Vowels {
	public int vowelscount(String string ) {
		int vowelscount =0;
		for(int i = 0; i < string.length(); i++) {    
            
            if(string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') 
            {    

            	vowelscount++;    
        }    
		
		
	}
		return vowelscount;
	}
}
	
	
	
	
	



