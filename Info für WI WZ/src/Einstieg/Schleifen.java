package Einstieg;

public class Schleifen {

	public static void main(String[] args) {
		int i;
		
		System.out.print("a) ");
		for(i=1;i<=10;i++)
			System.out.print(i+" ");
		System.out.println();
		
		System.out.print("b) ");
		for(i=10;i>=1;i--)
			System.out.print(i+" ");
		System.out.println();
		
		System.out.print("c) ");
		for(i=1;i<=17;i=i+2)
			System.out.print(i+" ");
		System.out.println();
		
		System.out.print("d) ");
		for(i=-1;i>=-10;i--)
			System.out.print(i+" ");
		System.out.println();
		
		System.out.print("e) ");
		int z;
		for(i=1;i<=10;i++){
			z=i*(int)Math.pow(-1, i+1);
			System.out.print(z + " ");
		}
		System.out.println();
		
		System.out.print("f) ");
		for(i=-1;i>=-10;i--)
			System.out.print(i+" ");
		System.out.println();
	}

}
