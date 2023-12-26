package Sorting;

public class BubbleSort implements Sortable{

	@Override
	public void sort(int[] array) {
		// TODO Auto-generated method stub
	int n = array.length;
	boolean swapped;
	do {
		swapped = false;
		for(int i =1; i<n; i++) {
			if(array[i-1]> array[i]) {
				int temp = array[i-1];
				array[i-1] = array[i];
				array[i] = temp;
				swapped = true;
			}
		}
	}while(swapped);
		
	}
}
