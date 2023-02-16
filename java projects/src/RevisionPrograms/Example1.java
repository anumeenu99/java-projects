package RevisionPrograms;

public class Example1 {
	int a, b;
	float z = 20f, y = 20f;

	public static void main(String[] args) {
		Example1 obj = new Example1(10, 20);
		obj.add();
	}

	public void add() {
		int a = 40, b = 23;
		int sum = a + b;
		System.out.println("Sum =" + sum);

	}

	// public void sum() {
	// System.out.println("methods");
	// }
	Example1(int a, int b) {
		// this.sum(); //only invoking constructor, but need to print the contents in
		// method
		this();
		this.add();
		this.a = a;
		this.b = b;
	}

	Example1() {

		float sumf = z + y;
		System.out.println("Sumf =" + sumf);
	}
}
