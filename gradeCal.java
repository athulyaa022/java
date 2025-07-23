import java.util.Scanner;
public class gradeCal {
	public static void main(String [] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter mark:");
		double marks = scanner.nextDouble();
		
		if (marks >=90 && marks <=100) {
			System.out.println("Yor grade is A");
		}
		else if(marks>=75) {
			System.out.println("Your grade is B");
		}
		else if(marks>=60) {
			System.out.println("Your grade is C");
		}
		else if(marks>=40) {
			System.out.println("Your grade is D");
		}
		else {
			System.out.println("Fail");
		}
		scanner.close();
	}
}
