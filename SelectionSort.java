package Sorting;

public class SelectionSort implements Sortable{

	@Override
	public void sort(int[] array) {
		// TODO Auto-generated method stub
		int n = array.length;
		  for (int i = 0; i < n - 1; i++) {
			  int minIndex = i;
	            for (int j = i + 1; j < n; j++) {
	            	if (array[j] < array[minIndex]) {
	            		 minIndex = j;
	            	}
	            }
	            int temp = array[i];
	            array[i] = array[minIndex];
	            array[minIndex] = temp;
		  }
	}

}
