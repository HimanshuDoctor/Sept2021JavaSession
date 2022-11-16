package JavaSection;

public class ArrayConcep {

	public static void main(String[] args) {
		
		String lang[] = new String[4];
		
		lang[0]="Java";
		lang[1]="Python";	
		lang[2]="JS";
		lang[3]="Ruby";
		
		
		
		for (int p=0; p<lang.length; p++) {
			System.out.println(p+":"+ lang[p]);
		}
		 System.out.println("=====================");
		
		for(String e: lang)	 {
			System.out.println(e);
		}
		
		
		System.out.println("==============");
		
	
	}

}
