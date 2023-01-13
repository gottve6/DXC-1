package test;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {

		/*
		 * String name = "Hackerearth"; for (int i = 0; i < name.length(); i++) {
		 * System.out.print(name.charAt(i + 1)); } // ackerearth
		 */

		int[] array = { 3, 6, 9, 5 };
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(array[0]);
		arrayList.add(array[2]);
		arrayList.set(1, array[0]);
		arrayList.set(1, array[1]);
		arrayList.remove(0);
		arrayList.add(array[0]);
		System.out.println(arrayList); // [6, 3]

	}

}
