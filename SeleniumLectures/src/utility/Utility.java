package utility;

public abstract class Utility {
	
	
	
	public static void assertEquals(String expected, String actual) {
		
		if(actual.equals(expected)) {
			System.out.println("PASSED");
		}else {
			System.out.println("FAILED\n"
					+ "Expected: " + expected + "\n"+
					  "Actual: "  + actual);
		}
		
		
		
	}
	
	
	public static void assertContains(String expected, String actual) {
		
		if(actual.contains(expected)) {
			System.out.println("PASSED");
		}else {
			System.out.println("FAILED\n"
					+ "Expected: " + expected + "\n"+
					  "Actual: "  + actual);
		}
		
		
		
	}


}
