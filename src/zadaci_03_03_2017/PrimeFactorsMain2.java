package zadaci_03_03_2017;

public class PrimeFactorsMain2 {

	public static void main(String[] args) {

		System.out.println("Ispis primeova ispod 120.. ");

		StackOfIntegers stack = new StackOfIntegers(20);

		for (int i = 2; i < 120; i++) {
			if (isPrime(i)) {
				stack.push(i);
			}
		}
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
	}

	public static boolean isPrime(int n) {

		double range = Math.sqrt(n);
		for (int i = 2; i < range; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
