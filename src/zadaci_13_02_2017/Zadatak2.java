package zadaci_13_02_2017;

/*
 * Napisati program koji simulira nasumièno izvlaèenje karte iz špila od 52 karte. 
 * Program treba ispisati koja karta je izvuèena (A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q ili K) te znak u kojem je data karta 
 * (Srce, Pik, Djetelina, Kocka). Primjer: Karta koju ste izvukli je 10 u znaku kocke.
 */
public class Zadatak2 {

	public static void main(String[] args) {
		
		String [] color = {"srce", "pik", "tref", "kocka"};
		String [] number = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		
		System.out.println("Karta je: " + number[(int)(Math.random() * number.length)] + " " + color[(int)(Math.random() * color.length)]);	
		
		
		
	}

}
