import java.util.Scanner;

import javax.sound.midi.Soundbank;



public class Calculator {

	public Calculator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		
		double result=0;
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Please enter your input method:"
				+ "\n 1. Three arguments"
				+ "\n 2. One  argument");
		
		String calculatorType=scanner.next();
	
		switch (calculatorType) {
		case "1":
			result=calculateWithThreeArguments();
			break;

		case "2":
			result=calculateWithOneArgument();
			break;
		default:
			System.out.println("Please enter a valid calculation type");
			break;
		}
		
		scanner.close();
		
		
		
		System.out.println(result);

	}
	
	public static double calculateWithThreeArguments() {
		double result=0;
		double firstOperand = 0; 
		double secondOperand = 0;
		String operator="1";
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please enter your first operand");
		firstOperand=scanner.nextDouble();
		System.out.println("Please enter your second operand");
		secondOperand=scanner.nextDouble();
		System.out.println("Please enter your operator! (+,-,*,/)");
		operator=scanner.next();
		result=calculate(firstOperand, secondOperand, operator);
		
		
		
		
		return result;
		
	}
	
	public static double calculateWithOneArgument() {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please enter your calculation!");
		String calculation= scanner.nextLine();
		
		double firstOperand = Double.parseDouble(calculation.split(" ")[0]);
		double secondOperand= Double.parseDouble(calculation.split(" ")[2]);
		
		String operator=calculation.split(" ")[1];
		System.out.println(operator);
		double result=calculate(firstOperand, secondOperand, operator);
		
		
		return result;
	}
	
	
	public static double calculate(double firstOperand, double secondOperand, String operator) {
		double result=0;
		switch(operator) {
		case "+":
			result=firstOperand+secondOperand;
			break;
		
		case "-":
			result=firstOperand-secondOperand;
			break;
			
		case "*":
			result=firstOperand*secondOperand;
			break;
		case "/":
			if (secondOperand!=0) {
				result=firstOperand/secondOperand;
				break;
			}
			else {
				System.out.println("Dont divide by 0 stupid");
				result= calculate(firstOperand, secondOperand+1, operator);
			}
			
			default:
				System.out.println("Please enter a valid operator!");

		
		}
		return result;
	}

}
