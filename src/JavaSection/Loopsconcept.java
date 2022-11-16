package JavaSection;

public class Loopsconcept {

	public static void main(String[] args) {
		
		// 1. while loop: 
		// 1 to 10:
		
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			++i;
		}
		
		int k = 1;
		while (true) {
			System.out.println(k);
			k++;
			if(k==20) {
				break;
			}
		}
		System.out.println("-------------");
		// for loop:
		
		for(int p=1; p<=10; p++) {
			System.out.println(p);
		}
		System.out.println("-------------");
		// for loop:
		int q=1;
		for(; q<=10; q++) {
			System.out.println(q);
		}
		
		for (int a = 1; a<=10; a = a+2) {
				System.out.println(a);	    
		}	
		
		
//		Character / A - Z
		
		for (char c = 'A'; c<='Z'; c++) {
			
			System.out.println(c);
		}
		
		for (int o = 'A'; o<='Z'; o++) {
			
			System.out.println(o);
		}
		
		System.out.println("=============");
		
		System.out.println(10%2);
		System.out.println(10%3);
		
		System.out.println("====Home Work ==add an even number====");
		
		
		for(int e=1; e<=10; e++ ) {
			if (e%2 == 0) {
				System.out.println(e);
			}
		}
		
		for(int t=1; t<=10; t++ ) {
			if(t%2 != 0) {
				System.out.println(t);
			}
		}
		
		System.out.println("===Dowhileloop====");
		
		
		int r=1;
		do {
			System.out.println(r);
			r++;
			
		} 
		while (r<=10);  		
		
		System.out.println("===Dowhileloop");
		
		int kr=1;
		do {
			kr++;
			System.out.println(kr);			
			
		} 
		while (kr>10);  
		
		System.out.println("****************");
		
		for(int m = 0; m<5; m++) {
			for(int n=0; n<5; n++) {
				System.out.print(m+""+n+" ");
//				System.out.print(m+""+n);// here not ln (only use print)
			}
			System.out.println();
		}
		

	}

}
