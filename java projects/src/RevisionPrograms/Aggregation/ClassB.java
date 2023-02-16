package RevisionPrograms.Aggregation;

public class ClassB {                     // parent class
public static void main(String []args) {
	ClassB obj=new ClassB();
	obj.add();
}
public void add() {
	int a=20,b=100;
	int sum=a+b;
	System.out.println("sum ="+sum);
}
}
