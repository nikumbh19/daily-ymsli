package labAssignmentDay1;

public class ex3 {

	
		public static void main(String[] args) {
			printTable(10);
		}
		
		public static void printTable(int n) {
			System.out.print("*"+" "+"|"+" ");
			for (int i = 1; i < n; i++) {
					System.out.print(i + " ");
			}
			System.out.println();
			for(int i=0;i<2*n;i++) {
				System.out.print("-");
			}
			System.out.println();
			for(int i=1;i<n;i++) {
				System.out.print(i+" "+"|"+" ");
				for(int j=1;j<n;j++) {
						System.out.print(i*j+" ");
				}
				System.out.println();
			}
		}

	
	}


