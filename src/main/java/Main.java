/**
	* Lesson: Practice Problem 5.5
	*	Author: Mr. Kalisz
	* Date Created: December 07, 2023
	* Date Last Modified: December 07, 2023
	*/

import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Table[] tables = new Table[5];

		tables[0] = new Table(1, 5, 3);
		tables[1] = new Table(5, 2, 2);
		tables[2] = new Table(4, 5, 3);
		tables[3] = new Table(2, 1, 4);
		tables[4] = new Table(3, 2, 1);

		//unsorted table array
		for (int i = 0; i < tables.length; i++) {
			System.out.println(tables[i]);
		}

		System.out.println("----------------------------------------------");
		Arrays.sort(tables);

		//sorted by comparable table array
		for (int i = 0; i < tables.length; i++) {
			System.out.println(tables[i]);
		}
  }
}