package JavaSection;

public class Stingconcatination {

	public static void main(String[] args) {
		
	 String x = "Hello";
	 String y = "Testing";
	 int a = 100;
	 int b = 200;
	 	 
	 	 
	 
	 System.out.println(x);
	 System.out.println(y);
	 
	 
	 
	 char c1 = 'a';
	 char c2 = 'b';
		
	 System.out.println(c1); 
	 System.out.println(c2);
	 System.out.println(c1+""+c2);	
	 
	 
	 byte b1 = 120;
	 byte b2 = 50;
	 //byte b3 = b1+b2; ( need highere value, int because of range problem )
	 System.out.println(b1+b2);
	 int b3 = b1+b2;
	 System.out.println(b3);
	 
	 byte v1 = 60;
	 byte v2 = 50;
	// byte v3 = v1+v2; //( # need bigger family member)
	// short v3 = v1+v2 // ( here also problem that way use int )
	 int v3 = v1+v2;
	 
	 System.out.println(v3);
	 
	 int g = 10;
	 int h = 3;
	 System.out.println(g/h);
	 
	 System.out.println(10/2);
	 System.out.println(10.0/2);
	 System.out.println(10.0/2.0);
	 System.out.println(10/3.0);
	 //System.out.println(9/0); error // ArithmeticException  
	 System.out.println(0/9);
	// System.out.println(0/0); Arithmetic Exception
	 System.out.println(0.0/0); // interview question
	 System.out.println(0/0.0); // interview question
	 System.out.println(5/0.0);
	 System.out.println(5.0/0.0);
	 
	 char t = 'a';
	 
	 System.out.println(t); // Asc11 vale consider in arithmetic condition only
	 System.out.println((int)t); // now here use asc11 value (here we do casting )	 
	 
	 
	 
	 

	}

}
