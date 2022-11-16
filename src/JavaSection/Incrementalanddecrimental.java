package JavaSection;

public class Incrementalanddecrimental {

	public static void main(String[] args) {
		
		//1. post increment:
		
		//increment // ++ Increment a value by one
		
		// decrement // -- Decrement a value by one
		
		// 1. post increment:
		
		int a = 1;
		int b = a++;
		System.out.println(a);
		System.out.println(b);
		
		int g = -99;
		int h = g++;
		
		System.out.println(g);
		System.out.println(h);
		
		// 2. pre increment :
		
		int c = 1;
		int d = ++c;
		System.out.println(c);
		System.out.println(d);
		
		int m = -97;
		int n = m++;
		
		System.out.println(m);
		System.out.println(n);
		
		int m1 = -97;
		int n1 = ++m1;
		
		System.out.println(m1);// -96
		System.out.println(n1);// -96
		
		
		// 3. Post decrement:
		
		int p = 2;
		int q = p--;
		
		System.out.println(p); //1
		System.out.println(q);// 2
		
		int u = 2;
		int y = --u;
		
		System.out.println(u); // 1
		System.out.println(y); // 1
		
		int t1 = 2;
		System.out.println(t1++); // now not increment value,  
		
		
		int d1 = 2;
		System.out.println(d1++);
		System.out.println(d1); // here increment the value
		System.out.println(d1); // Now not increment the value
		
		int l = 5;
		System.out.println(++l);
		
		
		
		

	}

}
