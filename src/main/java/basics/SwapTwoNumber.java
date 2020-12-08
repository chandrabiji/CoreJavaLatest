package basics;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number ?");
		int firstNumber = sc.nextInt();
		System.out.println("Enter Second Number ?");
		int secondNumber = sc.nextInt();
		System.out.println("Frist Number = "+firstNumber+" "+"Second Number = "+secondNumber);
		firstNumber=firstNumber+secondNumber;
		secondNumber=firstNumber-secondNumber;
		firstNumber=firstNumber-secondNumber;
		System.out.println("Frist Number = "+firstNumber+" "+"Second Number = "+secondNumber);
		sc.close();

	}

}
