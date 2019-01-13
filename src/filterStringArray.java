import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class filterStringArray {

	private static String[] str = new String[] {"1", "a", "b", "0", " 15", "b3"};
	private static String string = "3425jfdkd;;f544";
	
	
	// removes any Strings in array that contain a letter, 
	// even if they also contain a number.
	public static String[] filterArray(String[] str) {

		if( str == null ) return null;

		ArrayList<String> nums = new ArrayList<>();

		for( String a : str ) {
			
			if( a.matches( "(.)*(\\d)(.)*" ) ) { // regex that matches to Strings that contain a numeric value
				
				nums.add( a );	
			}
		}
		String[] filteredArray = new String[ nums.size() ];
		
		nums.toArray( filteredArray );
		
		System.out.println( Arrays.toString( filteredArray ) );
		
		return filteredArray;
	}
	
	// removes any non-numeric value from a String
	public static String filterString(String string) {
		
		if (string == null) return null; 
		
		string = string.replaceAll("\\D+", ""); // regex that removes any non-numeric token in a string
		
		System.out.println(string);
		
		return string;
	}
	

	public static void main(String[] args) {

		filterArray( str );
		
		filterString(string);
	}

}
