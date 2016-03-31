package contains;

/**
 * Demonstration class of contains String method
 * @author regis
 *
 */
public class MyClass {

	/**
	 * Return True if s string is contained in ref String
	 * @param ref : String of reference
	 * @param s : String to check
	 * @return
	 */
	public static boolean contains(String ref, String s) {
		boolean result = false;
		int index_contains = 0;
		
		// Basic check of the length of each strings
		if (s.length() <= ref.length()) {
			
			// Iterate over String ref
			for (int index_ref = 0 ; index_ref < ref.length(); index_ref++) {
				
				// If characters are the same
				if (ref.charAt(index_ref) == s.charAt(index_contains)) {
					
					// Found character matching
					System.out.println("Found character matching at :" + index_ref + " for character " + s.charAt(index_contains));
					index_contains++;
					
					// Check if we are at the end of the s string
					if (index_contains == s.length()) {
						result = true;
						break;
					}
					
				} else {
					index_contains = 0;
				}
			}
		}
		
		return result;
	}
	public static void main(String[] args) {
		boolean result = MyClass.contains("This is a sentence.", "sentence");
		System.out.println("Result :" + result);

	}

}
