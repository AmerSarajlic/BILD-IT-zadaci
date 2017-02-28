package zadaci_27_02_2017;

/**
 * (Compute the weekly hours for each employee) Suppose the weekly hours for all
 * employees are stored in a two-dimensional array. Each row records an
 * employee’s seven-day work hours with seven columns. For example, the
 * following array stores the work hours for eight employees. Write a program
 * that displays employees and their total hours in decreasing order of the
 * total hours.
 * 
 * @author amer
 *
 */
public class Zadatak1 {

	public static void main(String[] args) {
		int numberOfDays = 7;
		int numberOfWorkers = 8;
		int[][] weeklyHours = new int[numberOfWorkers][numberOfDays];
		int[] workersID = new int[numberOfWorkers];
		setWorkersID(workersID);
		randomHours(weeklyHours);
		displayHours(weeklyHours, workersID);
		sortedDisplay(weeklyHours, workersID);
		displayHours(weeklyHours, workersID);
	}

	public static void setWorkersID(int[] workersID) {
		for (int i = 0; i < workersID.length; i++) {
			workersID[i] = i + 1;
		}

	}

	public static int totalHoursPerWorker(int[] weeklyHours) {
		int sum = 0;
		for (int i = 0; i < weeklyHours.length; i++) {
			sum += weeklyHours[i];
		}
		return sum;
	}

	public static void sortedDisplay(int[][] weeklyHours, int[] workersID) {
		for (int i = 0; i < weeklyHours.length; i++) {
			for (int j = 0; j < weeklyHours.length; j++) {
				if (totalHoursPerWorker(weeklyHours[i]) > totalHoursPerWorker(weeklyHours[j])) {
					int[] temp = weeklyHours[i];
					weeklyHours[i] = weeklyHours[j];
					weeklyHours[j] = temp;

					int temp2 = workersID[i];
					workersID[i] = workersID[j];
					workersID[j] = temp2;
				}
			}
		}

	}

	public static void displayHours(int[][] weeklyHours, int[] workersID) {
		int[] hoursPerWorker = new int[8];
		System.out.printf("%15s%5s%5s%5s%5s%5s%7s", "Ned", "Pon", "Uto", "Sri", "Cet", "Pet", "Sub\n\n");
		for (int i = 0; i < weeklyHours.length; i++) {
			int sum = 0;
			System.out.print("Radnik " + workersID[i] + "|");
			for (int j = 0; j < weeklyHours[i].length; j++) {
				System.out.printf("%5d", weeklyHours[i][j]);
				sum += weeklyHours[i][j];
				hoursPerWorker[i] = sum;
			}
			System.out.print("  = " + sum);
			System.out.println();
		}
		System.out.println();
	}

	public static void randomHours(int[][] weeklyHours) {
		for (int i = 0; i < weeklyHours.length; i++) {
			for (int j = 0; j < weeklyHours[i].length; j++) {
				weeklyHours[i][j] = (int) (Math.random() * 9);
			}
		}
	}
}
