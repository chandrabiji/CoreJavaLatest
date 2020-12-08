package basics;

import java.util.Scanner;

public class VehicleSpeed {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Travel Distance ?");
		double distance = sc.nextDouble();
		System.out.println("Enter Your Travel Time ?");
		double time = sc.nextDouble();
		double speed = distance/time;
		System.out.println("Your Vehicle Speed = "+speed);

	}

}
