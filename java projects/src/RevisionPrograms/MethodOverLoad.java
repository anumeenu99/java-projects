package RevisionPrograms;

public class MethodOverLoad {
public static void main(String []args) {
	MethodOverLoad.sum(10, 20);
	MethodOverLoad.sum(5.0f, 2.0f);
}
public static void sum(int a,int b,int c) {
	int sum=a+b;
	System.out.println("sum ="+sum);
}
public static void sum(float z,float y) {
	float sum=z+y;
	System.out.println("sum ="+sum);
}
}

