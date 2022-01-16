package labAssignmentDay1;
import java.util.Scanner;
class ex2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no of Students");
	int noOfStudents = sc.nextInt();
	
	int grades[] = new int [noOfStudents];
	for(int i =0; i<noOfStudents; i++) {
		System.out.println("Enter the grades" +i);
		int grade = sc.nextInt();
		if(grade<0 || grade >100) {
			System.out.println(" you have entered wrong gardes");
			--i;
		}
		else {
			grades[i]= grade;
		}
	}
	int sum = 0;
	for(int i=0; i<noOfStudents; i++) {
		sum+=grades[i];
	}
	double average=sum/noOfStudents;
	System.out.println("Average is:" + average);
}
}
