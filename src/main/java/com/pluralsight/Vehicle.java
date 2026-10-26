package com.pluralsight;

public class Vehicle {

    /*
    create these properties:

    vehicleId - a long (ex: 101121)
makeModel - a string (ex: Ford Explorer)
color - a string (ex: Red)
odometerReading - an int (ex: 32775)
price - a double (ex: 12250.00) (no Lamborghinis here!)

     */
    private long vehicleID = 0;
    private String makeModel = "";
    private String color = "";
    private int odometerReading = 0;
    private double price = 0.0;

    // ! constructor
    public Vehicle(long vehicleID, String makeModel, String color, int odometerReading, double price) {
        this.vehicleID = vehicleID;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }

    // ! getters and setters
    public long getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(long vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

} // ! main class cBracket
