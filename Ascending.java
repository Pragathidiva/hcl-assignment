package day3assignment;

public class Ascending {
	public void ascendingorder(int[] array) {
		int temp;
		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("\nArray sorted in ascending order: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
