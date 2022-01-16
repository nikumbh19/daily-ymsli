package labAssignmentDay1;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 0, b = 1;
System.out.println(a+" "+b);
int c;
for(int i=1; i<=15; i++) {
	c= a+b;
	System.out.println(" "+c);
	a= b;
	b=c;
}
	}

}
