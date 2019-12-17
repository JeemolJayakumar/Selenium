package samples;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		int[] array= {89,67,34};
		String name[]= {"Anu","Sophy","Jeemol"};
		
		Arrays.sort(array);
		Arrays.parallelSort(name);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(name));
		

	}

}
