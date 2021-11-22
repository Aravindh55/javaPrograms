package java_programs;

public class Armstrong_number {

	public static void main(String[] args) {
		int n = 153;
		int original;
		int remainder;
		int calculated = 0;
		original = n;

		
		  while (n > 0) { remainder = n%10; n = n/10; calculated = calculated +
		  (remainder*remainder*remainder);
		  
		  } if (original == calculated) { System.out.println("armstrong number");
		  
		  } else { System.out.println("not a armstrong number"); }
		 
	}

}
