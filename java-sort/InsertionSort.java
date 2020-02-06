

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {

		int[] numbers = { 4, 1, 8, -3, 5, 7 };
		
		System.out.println("Unsortiert:\t" + Arrays.toString(numbers));
		insertionSort(numbers);
		System.out.println("Sortiert:\t" + Arrays.toString(numbers));

	}

	public static void insertionSort(int[] numbers) {
		
		for (int i = 1; i < numbers.length; i++) {
			int temp = numbers[i];
			int j = i;
			while (j > 0 && numbers[j - 1] > temp) {
				numbers[j] = numbers[j - 1];
				j--;
			}
			numbers[j] = temp;
		}
	}
}

// Sort Animation: https://www.youtube.com/watch?v=cvUHYiC6sf8
