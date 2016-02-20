package Einstieg;

public class Feldvariable {
	
	public static void main(String[] args) {
		
		int[] feld = new int[20];
		
		System.out.println("Ausgabe Feld 1:");
		for(int i=0; i <= 19; i++){
			feld[i]=(int)(Math.random() * 100) + 1;
			System.out.println(feld[i]);
		}
		
		int[] feldreverse = new int[20];
		
		System.out.println("Ausgabe Feld 2:");
		for(int i=0; i <= 19; i++){
			feldreverse[i]=feld[19-i];
			System.out.println(feldreverse[i]);
		}
		
		System.out.println("Ausgabe Feld mit Vertauschung:");
		int temp;
		for(int i=0; i <= 18; i++){
			if(feld[i] > feld[i+1]) {
				temp = feld[i];
				feld[i]=feld[i+1];
				feld[i+1]=temp;
			}
		for(i=0; i <= 19; i++)
			System.out.println(feld[i]);
		}
		
		System.out.println("Ausgabe Feld sortiert:");
		boolean flag=true;
		while(flag){
			flag=false;
			for(int i=0; i <= 18; i++){
				if(feld[i] > feld[i+1]) {
					temp = feld[i];
					feld[i]=feld[i+1];
					feld[i+1]=temp;
					flag=true;
				}
			}
		}
		for(int i=0; i <= 19; i++)
			System.out.println(feld[i]);
	}
}
