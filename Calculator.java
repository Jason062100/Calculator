import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		System.out.println("If you would like to add type add. If you would like to subtract type subtract. ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		
		if (s.equalsIgnoreCase("add")) {
			System.out.println("What is the first number you would like to add? ");
			int intOne = sc.nextInt();
			System.out.println("What is the second number you would like to add? ");
			int intTwo = sc.nextInt();
			int intAdd = intOne + intTwo;
			System.out.println(intOne + " + " + intTwo + " = " + intAdd);
		} else {
			System.out.println("What is the first number you would like to subtract? ");
			int intThree = sc.nextInt();
			System.out.println("What is the second number you would like to subtract? ");
			int intFour = sc.nextInt();
			int intSub = intThree - intFour;
			System.out.println(intThree + " - " + intFour + " = " + intSub);
		} 
			
	}
		
}
