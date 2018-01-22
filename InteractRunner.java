import java.util.Scanner;

public class InteractRunner {

	public static void main(String[] arg) {
		Scanner scaner = new Scanner(System.in);
		try{

			Calculator calculator = new Calculator();
			String exit = "n";
			while (!exit.equals("y")) {
				System.out.println("Enter first arg: ");
				String first = scaner.next();
				System.out.println("Enter second arg: ");
				String second = scaner.next();
				calculator.add(Integer.valueOf(first), 
					Integer.valueOf(second));
				System.out.println("Result = " + calculator.getResult());
				calculator.cleanResult();
				System.out.println("Exit: y/n ");
				exit = scaner.next();
			}
		}
		finally {
			scaner.close();
		}
	}
	
}