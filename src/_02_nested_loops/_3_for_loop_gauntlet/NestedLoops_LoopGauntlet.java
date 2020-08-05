package _02_nested_loops._3_for_loop_gauntlet;

public class NestedLoops_LoopGauntlet {

	public static void main(String[] args) {

		for (int i = 0; i < 101; i++) {
			System.out.println(i);

		}
		for (int i = 100; i > -1; i--) {
			System.out.println(i);
		}
		for (int i = 2; i < 101; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		for (int i = 0; i < 501; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is even");
			} else {
				System.out.println(i + " is odd");
			}
		}
		for (int i = 7; i < 778; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}
		for (int i = 2020; i > 2002; i--) {
			System.out.println("In " + i + " I was " + (i - 2003) + " years old");
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(i + " " + j);
			}
		}
		for (int i = 1; i < 9; i += 3) {
			System.out.println();
			for (int j = i; j < i + 3; j++) {
				System.out.print(j);
			}
		}
		for (int i = 1; i < 100; i += 10) {
			System.out.println();
			for (int j = i; j < i + 10; j++) {
System.out.print(j);
			}}
	for (int i = 1; i < 7; i++) {
		System.out.println();
		for (int j = 1; j < i; j++) {
			System.out.print("*");
		}
	}

	}
}
