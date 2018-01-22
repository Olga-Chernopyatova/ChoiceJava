package ChoiceJavaPack;

import java.util.Scanner;

public class choiveJava {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        System.out.println ("Enter 1 or 2");
	        int num = scanner.nextInt();
	       
	if (num==1) {
		
        double number1;
        double number2;
        String operator;

        System.out.print("Enter > ");

        number1 = scanner.nextDouble();
        operator = scanner.next();
        number2 = scanner.nextDouble();

        if (operator.equals("*")){
            System.out.println("= " + (number1 * number2));
        }
        if (operator.equals("/")){
            System.out.println("= " + (number1 / number2));
        }
        if (operator.equals("+")){
            System.out.println("= " + (number1 + number2));
        }
        if (operator.equals("-")){
            System.out.println("= " + (number1 - number2));}
       }
	if (num==2) {
		String [] strArray = {"Richard","of", "York", "gains", 
				"battles", "in", "vain"};
						
	int max = strArray [0].length();
	int mi=0;
	for (int i = 1; i<strArray.length; i++) {
		int a=strArray[i].length();
    if (max < a ) {
		max = strArray[i].length();
		mi=i;
	} }
	System.out.println("The longest word: " + strArray[mi] + " number of symbols is " + max);	
	}
	 else {
		 
		 System.out.println("Try again ");
	}
	}

}
