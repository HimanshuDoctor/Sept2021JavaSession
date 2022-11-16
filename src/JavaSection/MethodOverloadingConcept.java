package JavaSection;

public class MethodOverloadingConcept {
	
	public void start() {
}
	public void start(int a ) {
		System.out.println(a); // This is compile time 
		                       // Decision already ten on compile time
}
	public void start(String a, int b) {
}

	public static void main(String[] args) {
		
		MethodOverloadingConcept obj = new MethodOverloadingConcept();
		obj.start (10);
		
		
	}
	

}
