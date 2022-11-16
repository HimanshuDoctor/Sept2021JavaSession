
public class Browser {
	
	String name;
	double version;
	String vendor;
	
	public void getInfo(Browser br ) {
		
		System.out.println(br.name +" " + br.version + " "+ br.vendor);
	}
	
	
	public static void main(String[] args) {
		
		Browser b = new Browser();
		b.getInfo(b);
		
		
		
		
		

	}

}
