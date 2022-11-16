package JavaSection;

public class ifelsecondition {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 20;
		
		if(a>b) {
			System.out.println("a is gater then b");
		}
		else {
			System.out.println("b is gater then a");
		}	
		
		if (a == b) {
			System.out.println("both are equal");
		}
		
		boolean flag = true;
		if (flag) {
			System.out.println("pass");			
		}
		else {
			System.out.println("Fail");
		}
		
		int number = 101;
		
		if (number <= 100) {			
				if (number >= 90 ) {
					System.out.println("Grade A");					
				}
				if (number >= 75) {
					System.out.println("Grade B");
				}			
		}
		else {
			System.out.println("invalid number");
		}
		
		
		
//		String browser = "firefox";
//		
//		if(browser.equals("chrome")) {
//			System.out.println("launch chrom");
//			
//		}
//		
//		if(browser.equals("firefox")) {
//			System.out.println("launch firefox");
//		}
//	
//		if(browser.equals("safari")){
//			System.out.println("launch Safari");
//		}
//		if(browser.equals("IE")){
//			System.out.println("launch IE");
//		}
//		else {
//			
//		}
		
		String browser = "oPERA";
		
		if(browser.equals("chrome")) {
			System.out.println("launch chrome");
		}
		else if (browser.equals("firefox")) {
			System.out.println("launch fireefoxe");
		}
		else if (browser.equals("safari")) {
			System.out.println("launch safari");
		}
		else if (browser.equals("IE")) {
			System.out.println("launch IE");
		}
		else {
			System.out.println(" plz pass the right browser...");
		}		
				

	}

}
