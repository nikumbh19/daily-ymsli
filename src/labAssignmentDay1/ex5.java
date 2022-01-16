package labAssignmentDay1;
import java.util.Arrays;

public class ex5 {
	
	
		public static void main(String[] args) {
		
			int[] original = new int[] {10, 11, 67};
		     
		      System.out.println("Original Array : ");
		      for (int i = 0; i < original.length; i++)
		           System.out.print(original[i] + " ");  
		        
		      int[] copy = Arrays.copyOf(original, original.length);
			    
		       System.out.println("New array copy");
		       for (int i = 0; i < copy.length; i++) 
		           System.out.print(copy[i] + " ");
		       
		}

	}

