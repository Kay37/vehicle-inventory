package com.pluralsight;

import java.util.Scanner;

import java.util.Arrays;

public class VehicleInventory {
    public static int numberOfVehiclesInInventory = 0;

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // * create an array capable of holding up to 20 vehicles
        Vehicle[] inventory = new Vehicle[20];

        // * create a variable that stores how many vehicles are in the array right now

        // * create six vehicles and put them in the array
        Vehicle vehicle1 = new Vehicle(1234567, "Ford Explorer", "Black", 150000, 32999.99);
        Vehicle vehicle2 = new Vehicle(2345678, "Toyota Camry", "Silver", 42000, 24999.99);
        Vehicle vehicle3 = new Vehicle(3456789, "Honda Civic", "Blue", 68500, 18499.50);
        Vehicle vehicle4 = new Vehicle(4567890, "Chevrolet Silverado", "Red", 98000, 35999.00);
        Vehicle vehicle5 = new Vehicle(5678901, "Tesla Model 3", "White", 15000, 38999.99);
        Vehicle vehicle6 = new Vehicle(6789012, "Jeep Wrangler", "Green", 77200, 29999.95);

        inventory[0] = vehicle1;
        inventory[1] = vehicle2;
        inventory[2] = vehicle3;
        inventory[3] = vehicle4;
        inventory[4] = vehicle5;
        inventory[5] = vehicle6;

        numberOfVehiclesInInventory = 6;
        // * create a loop with this menu in the loop

        /*
        What do you want to do?
1 - List all vehicles
2 - Search by make/model
3 - Search by price range
4 - Search by color
5 - Add a vehicle
6 - Quit
Enter your command:
         */

        // * focus on menu items 1, 2, and 5

        boolean appRunning = true;
        while (appRunning) {

            //create the menu
            System.out.println("What do you want to do?");
            System.out.println(" 1 - List all vehicles");
            System.out.println(" 2 - Search by make/model");
            System.out.println(" 3 - Search by price range");
            System.out.println(" 4 - Search by color");
            System.out.println(" 5 - Add a vehicle");
            System.out.println(" 6 - Quit");
            System.out.println("Enter your command: ");

            //store the answer
            int command = sc.nextInt();
            sc.nextLine();
            //do something based on the answer
            switch (command) {
                case 1 -> listInventory(inventory);
                case 2 -> searchMakeModel(inventory);
                case 5 -> addVehicle(inventory);
                case 6 -> appRunning = false;
                default -> System.out.println("Invalid command");
            }

        } // ! while loop cBracket

    } // ! main method cBracket

    public static void addVehicle(Vehicle[] inventory) {
        System.out.println("Please enter the vehicle's ID: ");
        int vehicleID = sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter the vehicle's make and model (e.g. Ford Explorer): ");
        String makeModel = sc.nextLine();
        System.out.println("Please enter the vehicle's color: ");
        String color = sc.nextLine();
        System.out.println("Please enter the vehicle's odometer reading: ");
        int odometerReading = sc.nextInt();
        System.out.println("Please enter the vehicle's price: ");
        double price = sc.nextDouble();

        Vehicle newVehicle = new Vehicle(vehicleID, makeModel, color, odometerReading, price);

        inventory[numberOfVehiclesInInventory] = newVehicle;

        VehicleInventory.numberOfVehiclesInInventory++;

    } // ! addVehicle cBracket

    public static void listInventory(Vehicle[] inventory) {
        for (int i = 0; i < numberOfVehiclesInInventory; i++) {
            System.out.println("Vehicle ID: " + inventory[i].getVehicleID() + "\nMake & Model: " + inventory[i].getMakeModel() + "\nColor: " + inventory[i].getColor() + "\nOdometer Reading: " + inventory[i].getOdometerReading() + "\nPrice: " + inventory[i].getPrice() + "\n");
        }
    }
    public static void searchMakeModel(Vehicle[] inventory) {
        int matchCount = 0;
        System.out.println("Please enter the make and model you'd like to search for: ");
        String makeModel = sc.nextLine();
        System.out.println("Your search results: \n");
        for (int i = 0; i < numberOfVehiclesInInventory; i++) {
            if (inventory[i].getMakeModel().equalsIgnoreCase(makeModel)) {
                matchCount++;
                System.out.println(matchCount + ")\nVehicle ID: " + inventory[i].getVehicleID() + "\nMake & Model: " + inventory[i].getMakeModel() + "\nColor: " + inventory[i].getColor() + "\nOdometer Reading: " + inventory[i].getOdometerReading() + "\nPrice: " + inventory[i].getPrice() + "\n");
            }
        }
        if (matchCount == 0) {
            System.out.println("No match found for your search.\n");
        }
    }
} // ! main class cBracket