package labAssignmentDay1;

public class ex4 {
	
		public static void main(String[] args) {
			printPattern(8);
		}
		public static void printPattern(int n) {
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
		}

	}

