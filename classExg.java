
class Student{
	String name;
	int age;
	public void displaydetails() {
		System.out.println(name);
		System.out.println(age);
		
	}
}
public class newClass {
	public static void main(String [] args) {
		Student student=new Student();
		student.name="Rose";
		student.age=20;
		student.displaydetails();
