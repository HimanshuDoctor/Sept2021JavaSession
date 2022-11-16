
public class TestBlock {
	
	static {
		System.out.println("static block");
	}
	
	public void test() {
		
		System.out.println("test");
	}
	
	public static void test1() {
		System.out.println("test");
	}
	

	public static void main(String[] args) {
		System.out.println("this is main");
		test1();
		

	}

}
