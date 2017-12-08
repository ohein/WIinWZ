package Einstieg;

public class Klausur {

	public static void main(String[] args) {
		
		int anzahl=0;
		for (int i=-4;i<=3;i++)
			  for (int j=1;j<5;j++)
				  anzahl++;
		System.out.println(anzahl);
		
		anzahl=0;
		int i=1;
		for (int j=1; j<=10; j++)    
		   do {   	
			   anzahl++;
		   } while (i>1);

		System.out.println(anzahl);
		anzahl=0;
		for (i=1;i<=5;i++){
		  int j=2;
		  while(j<=10){ 	    
			  anzahl++;
			  j=j+2;
		  }
		}
		System.out.println(anzahl);
		
		anzahl=0;
		i=1;
		while (i<70) {	    	
			if (i>=20)        
				i=i+20;
			anzahl++;
			i=i+1;
		} 
		
		System.out.println(anzahl);
		int z = 1;
		   for (i=1; i<=3; i++)
		      z = z + f1(i);
		   System.out.println("z = " + z);
	}
	
	public static int f1 (int a) {
		return 3 * f2(a);
	}
			
	public static int f2 (int b) {
		return b + 2;
	}
}
