class Employee{
	String name;
	int id;
	double salary;
	Employee(String name,int id,double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public void displayEmployee() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(salary);
	}
}
public class newConst {
	public static void main(String [] args) {
		Employee emp1=new Employee("Diya",100,50000);
		Employee emp2=new Employee("Elna",105,60000);
		emp1.displayEmployee();
		emp2.displayEmployee();
	}

}
