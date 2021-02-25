package com.company.Classes;

public class Car extends Venicle {
    private String fuel;
    private int capacity;

    public Car(String id, double cost, double speed, int year, String fuel, int capacity) {
        super(id, cost, speed, year);
        this.fuel = fuel;
        this.capacity = capacity;
    }



    @Override
    public String toString() {
        return super.toString()+
                +
                this.capacity+ this.fuel+"car";
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}
