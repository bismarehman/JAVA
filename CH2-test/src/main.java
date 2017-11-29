public class main {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;

		for (i = 1; i <= 10; i++) {
			for (j = 1; j <= 10; j++) {
				printval(i, j);
			}
			System.out.println("");
		}
	}

	public static void printval(int a, int b) {
		System.out.println(a + " X " + b + " = " + (a * b));
	}
}
