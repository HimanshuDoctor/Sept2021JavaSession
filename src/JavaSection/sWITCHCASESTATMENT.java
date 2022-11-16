package JavaSection;

public class sWITCHCASESTATMENT {

	public static void main(String[] args) {
		
		
		String browser = "IE";
		
		switch (browser) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "IE":
			System.out.println("launch IE");
			break;	

		default:
			System.out.println("plz pass the right browser name... ");
			break;
		}   
		
		//
		int marks = 80;
		switch (marks) {
		case 100:
			System.out.println("Grad A");			
			break;
		case 90:
			System.out.println("Grad B");			
			break;
		case 80:
			System.out.println("Grad C");			
			break;
		default:
			System.out.println("Grad D");
			break;
		}
		//
		
//		int num = 10;
//		
//		switch (num) {
//		case value:
//			
//			break;
//
//		default:
//			break;
		}
		
	
			
		
		

	}


