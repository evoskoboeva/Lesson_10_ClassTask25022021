package com.company.Classes;

import java.util.Objects;

public class Venicle {
    private String id;
    private double cost;
    private double speed;
    private  int year;

    @Override
    public String toString() {
        return "com.company.Classes.Venicle{" +
                "id='" + id + '\'' +
                ", cost=" + cost +
                ", speed=" + speed +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Venicle)) return false;
        Venicle venicle = (Venicle) o;
        return Double.compare(venicle.getCost(), getCost()) == 0 && Double.compare(venicle.getSpeed(), getSpeed()) == 0 && getYear() == venicle.getYear() && getId().equals(venicle.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCost(), getSpeed(), getYear());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Venicle(String id, double cost, double speed, int year) {
        this.id = id;
        this.cost = cost;
        this.speed = speed;
        this.year = year;
    }

    public Venicle(String id) {
        this.id = id;
    }
}
