package RevisionPrograms;

public class MethodAverage {
	static int sum;
public static void main(String []args) {
	MethodAverage.sum(10,20);
	MethodAverage.sum();
}
public static int sum(int a,int b) {
	sum=a+b;
	System.out.println("sum ="+sum);
	return sum;
}
public static void sum() {
	//int av=sum();
	int average=(sum)/2;
	System.out.println("Average ="+average);
}
}
