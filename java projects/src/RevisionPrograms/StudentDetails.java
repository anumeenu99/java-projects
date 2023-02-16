package RevisionPrograms;

public class StudentDetails {
static String clg="SXCCE";
String name,dep;
int rollno;
public static void main(String []args) {
	System.out.println("College:"+clg);
	StudentDetails obj=new StudentDetails("Anu",201719,"ECE");
	obj.details();
	StudentDetails obj1=new StudentDetails("aparna",201720,"CSE");
	obj1.details();
	StudentDetails obj2=new StudentDetails("Ritty",201730,"CE");
	obj2.details();
}
StudentDetails(String name,int rollno,String dep)
{
	this.name=name;
	this.dep=dep;
	this.rollno=rollno;
}
public void details() {
	System.out.println("Name="+name +"  "+ "Rollno="+rollno +"  "+ "Department="+dep);
	
}
}
