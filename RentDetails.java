package javaassinment;

import java.util.*;

public class RentDetails extends CarInformation {
	public static void main(String[] args) {

		final int charge = 8;
		double total_charge;
		char cardriver = 'n';
		int mindis = 999999;
		String carname;

		Scanner sc = new Scanner(System.in);
		System.out.println("Customer Ride Distance: ");

		double distance = sc.nextDouble();
		System.out.println("car requested:");

		carname = sc.next();
		RentDetails r = new RentDetails();

		r.CarInformations();
		for (int j = 0; j < 5; j++) {

			if (r.carmodel[j].equals(carname) && r.rating[j] >= 4) {

				if (mindis > r.distance[j]) {

					mindis = r.distance[j];
					cardriver = r.driver[j];
				

				}
			}

		}

		total_charge = distance * 8;
		System.out.println("Driver " + cardriver + " will get you to the destination");
		System.out.println("Your charge will be " + total_charge);

	}

}
