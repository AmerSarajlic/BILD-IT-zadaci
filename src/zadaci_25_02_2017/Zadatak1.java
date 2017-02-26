package zadaci_25_02_2017;

/**
 * (Count single digits) Write a program that generates 100 random integers
 * between 0 and 9 and displays the count for each number. (Hint: Use an array
 * of ten integers, say counts, to store the counts for the number of 0s, 1s, .
 * . . , 9s.)
 * 
 * @author amer
 *
 */
public class Zadatak1 {

	public static void displayArray(int[] array) {

		for (int number = 0; number < array.length; number++) {
			System.out.println(number + " --> " + array[number] + " puta.");

		}
	}

	public static void main(String[] args) {

		int[] array = new int[10];
		for (int number = 0; number < 100; number++) {
			int num = (int) (Math.random() * 10);
			for (int index = 0; index < array.length; index++) {
				if (num == index) {
					array[index]++;
				}
			}
		}
		displayArray(array);
	}
}