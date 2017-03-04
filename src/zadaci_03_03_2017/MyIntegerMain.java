package zadaci_03_03_2017;

public class MyIntegerMain {

	public static void main(String[] args) {

		MyInteger num1 = new MyInteger(7);
		MyInteger num2 = new MyInteger(7);
		MyInteger num3 = new MyInteger(25);

		System.out.printf("Number1 = %d; isPrime: %b; isOdd: %b; isEven %b\n", num1.getValue(), num1.isPrime(),
				num1.isOdd(), num1.isEven());

		System.out.printf("Number2 = %d; isPrime: %b; isOdd: %b; isEven %b\n", num2.getValue(), num2.isPrime(),
				num2.isOdd(), num2.isEven());
		System.out.printf("Number3 = %d; isPrime: %b; isOdd: %b; isEven %b\n", num3.getValue(), num3.isPrime(),
				num3.isOdd(), num3.isEven());

		System.out.printf("Num1 == Num2: %b\n", num1.equals(num2));
		System.out.printf("Num1 == Num3: %b\n", num1.equals(num3));
		System.out.printf("Parse int 100 string value == %d\n", MyInteger.parseInt("100"));
		System.out.printf("Parse int 150 char array value == %d\n", MyInteger.parseInt("150".toCharArray()));

	}
}
