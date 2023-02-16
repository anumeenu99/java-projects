package RevisionPrograms.Inheritance;

public class ClassA extends ClassB {
int b=20;
public static void main(String []args) {
	ClassA obj=new ClassA();
	System.out.println(obj.a);
	System.out.println(obj.b);
	obj.addition();
	
	obj.sub();
}
	public void sub() {
		int minus=c-a;
		System.out.println("minus ="+minus);
	}
}
