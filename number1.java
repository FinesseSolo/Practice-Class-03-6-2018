	import java.util.Scanner;
	public class number1 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	System.out.println("Please enter 3 integers");
	
	Scanner scanner = new Scanner(System.in);
	
	int num1 = scanner.nextInt();
	
	int num2 = scanner.nextInt();
	
	int num3 = scanner.nextInt();
	
	if ( num1 > num2 && num1 > num3 )
	    System.out.println("First number is largest.");
	 else if ( num2 > num1 && num2 > num3 )
	    System.out.println("Second number is largest.");
	 else if ( num3 > num1 && num3 > num1 )
	    System.out.println("Third number is largest.");
		
		if ( num1 < num2 && num1 < num3 )
		    System.out.println("First number is smallest.");
		 else if ( num2 < num1 && num2 < num3 )
		    System.out.println("Second number is smallest.");
		 else if ( num3 < num1 && num3 < num1 )
		    System.out.println("Third number is smallest.");
		}
	}
