package zadaci_20_02_2017;

/**
 * Napisati metodu sa sljedeæim headerom: public static int isPrime(int n) koja
 * provjerava da li je broj prost/prime. Napsati test program koji poziva ovu
 * metodu i ispisuje sve proste brojeve u rasponu od 0 do 100000.
 * 
 * @author amer
 *
 */
public class Zadatak3 {

	
	/**
	 * metoda koja vraca int
	 * @param n
	 * @return
	 */
	
	public static int isPrime(int n){
		for (int i = 2; i < n; i++) {
			if(n % i == 0){
				return 1;
			}
		}
			return 0;
	}

	public static void main(String[] args) {
		int counter = 0;
		for (int i = 2; i <= 100000; i++) {
			
			/**
			 *  ako metoda vrati nulu, broj je prime
			 */
			
			if(isPrime(i) == 0){
				System.out.printf("%6d", i);
				counter++;
				if(counter % 10 == 0){
					System.out.println();
				}
			}				
		}
	}
}
