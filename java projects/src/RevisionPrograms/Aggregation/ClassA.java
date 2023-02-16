package RevisionPrograms.Aggregation;

public class ClassA {                        //child class
public static void main(String []args) {
	ClassA obj1=new ClassA();
	obj1.total();
}
public void total() {
	int z=50,y=40;
	int t=z-y;
	System.out.println("total ="+t);
	ClassB obj=new ClassB();
	obj.add();
}
}
