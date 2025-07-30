package pro3;

class Stud {
	int rollno;
	String name;
	int m1,m2,m3;
	int avg;
	Stud(int rollno, String name, int m1,int m2, int m3){
		this.rollno=rollno;
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	public void calculateAverage() {
	    avg=(m1+m2+m3)/3;
	}
	void displayDetails(){
		System.out.println("roll no: "+rollno);
		System.out.println("Name: "+name);
		System.out.println("Mark1:"+m1+"\tMark2:"+m2+"\tMark3:"+m3);
		System.out.println("Average marks:"+avg);
	}
		
	}

public class StudentDemo {
	public static void main(String[] args) {
		Stud s1 = new Stud(1,"Diya",40,50,60);
		s1.calculateAverage();
		Stud s2 = new Stud(2,"Elna",50,45,50);
		s2.calculateAverage();
		s1.displayDetails();
		s2.displayDetails();
		
		
		}

}
