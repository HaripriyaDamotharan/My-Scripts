package week1.day2;

public class AssignmentFibonacci {

	public static void main(String[] args) {
		int range = 8;
		int n1 = 0;
		int n2 = 1;
		int n3;

		System.out.println(n1);
		for (int i = 1; i < range; i++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.println(n3);
		}
	}

}
