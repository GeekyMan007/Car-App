package CarApp;

import java.util.Scanner;

public class CarManufactureApp {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean exit = false;
		CarManufactureApp obj = new CarManufactureApp();
		Car[] cars = {};
		do {
			int ch = obj.displayMenu();

			switch (ch) {
			case 1:
				cars = obj.enterDetails();
				System.out.println("Details entered successfully.");
				System.out.println("===========================================");
				break;

			case 2:
				obj.displaycars(cars);
				break;
			case 3:
				obj.sortByCarName(cars);
				obj.displaycars(cars);
				break;
			case 4:
				obj.searchSpeedByName(cars);
				obj.displaycars(cars);
				break;
			case 5:
				obj.sortByCarName(cars);
				obj.displaycars(cars);
				break;
			case 6:
				obj.sortBySpeed(cars);
				obj.displaycars(cars);
				break;
			case 7:
				obj.seaechBySpeed(cars);
				break;
			case 8:
				int n = cars.length;
				obj.removeCar(cars, n);
				break;

			case 9:
				System.out.println("Thank you.");
				exit = true;
				break;

			default:
				System.out.println("Invalid option :/");
			}
		} while (exit != true);

		sc.close();

	}

	private Car[] removeCar(Car[] cars, int n) {
		System.out.println("Enter the car id to remove");
		int id = sc.nextInt();
		n = cars.length;
//		int i;
		for (int i = 0; i < cars.length; i++) {
			if(cars[i].getId()==id) {
				cars[i]=new Car();
			}
			System.out.println("Deleted");

		}
		return cars;
		
//			}
//			
//		}
//		if(i<n) {
//			n=n-1;
//			for (int j = i; j < n; j++) {
//				cars[j]=cars[j+1];
//				
//			}
//		}
//		return cars;

//		boolean flag = false;
//		Car[] temp = new Car[n - 1];
//		for (int i = 0; i < cars.length; i++) {
//			if (cars[i].getId() == id) {
//				cars[i] = cars[n - 1];
//				cars[n - 1] = new Car();
//				for (int j = 0; j < temp.length; j++) {
//					temp[i] = cars[i];
//				}
//				System.out.println("Deleted ");
//				flag = true;
//				n--;
//			}
//		}
//		if (flag == false) {
//			System.out.println("Details is not present");
//		} else {
//			System.out.println("Empty list");
//		}
//
//		return temp;

	}

	private Car[] seaechBySpeed(Car[] cars) {
		System.out.println("Enter the speed of the car");
		double speed = sc.nextDouble();
		for (int i = 0; i < cars.length; i++) {
			if (cars[i].getSpeed() == speed) {
				System.out.println("Car's name is:" + cars[i].getName());
			}
		}
		return cars;

	}

	private Car[] searchSpeedByName(Car[] cars) {
		System.out.println("Enter the name of the car");
		String name = sc.next();
		for (int i = 0; i < cars.length; i++) {
			if (cars[i].getName() == name) {
				System.out.println("The speed of the car is:" + cars[i].getSpeed());
			}
		}
		return cars;

	}

	private Car[] sortBySpeed(Car[] cars) {
		for (int i = 0; i < cars.length; i++) {
			int j = i - 1;
			Car key = cars[i];
			while (j >= 0 && cars[i].getSpeed() > cars[i].getSpeed()) {
				cars[j + 1] = cars[j];
				j--;
			}
			cars[j + 1] = key;
		}
		return cars;

	}

	private Car[] sortByCarName(Car[] cars) {
		for (int i = 0; i < cars.length; i++) {
			for (int j = 0; j < cars.length - i - 1; j++) {
				if (cars[j].getName().compareTo(cars[j + 1].getName()) > 0) {
					Car temp = cars[j + 1];
					cars[j + 1] = cars[j];
					cars[j] = temp;
				}
			}
		}
		return cars;

	}

	private Car[] displaycars(Car[] cars) {
		for (int i = 0; i < cars.length; i++) {
			
				System.out.println("Car's name is: " + cars[i].getName());
				System.out.println("Car's type is: " + cars[i].getType());
				System.out.println("Car's id is: " + cars[i].getId());
				System.out.println("Car's color is: " + cars[i].getColor());
				System.out.println("Car's seat is: " + cars[i].getSeats());
				System.out.println("Car's speed is: " + cars[i].getSpeed());
				System.out.println("============================================");
			
		}
		return cars;

	}

	private Car[] enterDetails() {
		System.out.println("Enter the number of cars to enter");
		int num = sc.nextInt();
		Car[] cars = new Car[num];
		for (int i = 0; i < cars.length; i++) {
			System.out.println("Enter the car name");
			String name = sc.next();
			System.out.println("Enter the type of car(ptrol/diesel)");
			String type = sc.next();
			System.out.println("Enter the car id");
			int id = sc.nextInt();
			System.out.println("Enter the color of the car");
			String color = sc.next();
			System.out.println("Enter the number of seats in the car");
			int seats = sc.nextInt();
			System.out.println("Enter the speed of the car");
			double speed = sc.nextDouble();
			cars[i] = new Car(name, type, id, color, seats, speed);

		}
		return cars;
	}

	private int displayMenu() {
		System.out.println("=================================================" + "\nWELCOME TO THE SHOP"
				+ "\n================================================="
				+ "\n1.Enter details of the Car\n2.Display the details of cars" + "\n3.Sort and display car details"
				+ "\n4.Search name of the car and display the speed");
		System.out.println(
				"5.Sort by the Car name.\n6.Sort by Speed of the car.\n7.Search car by the speed.\n8.Remove car by id.\n9.Exit");
		System.out.println("Enter ur choice:");
		int ch = sc.nextInt();

		return ch;
	}

}
