package com.company.Classes;

import java.util.Arrays;
import java.util.Objects;

public class Garage {

    Venicle[] garage;
    int count;



    @Override
    public String toString() {
        return "com.company.Classes.Garage{" +
                "garage=" + Arrays.toString(garage) +
                ", count=" + count +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Garage)) return false;
        Garage garage1 = (Garage) o;
        return getCount() == garage1.getCount() && Arrays.equals(getGarage(), garage1.getGarage());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getCount());
        result = 31 * result + Arrays.hashCode(getGarage());
        return result;
    }

    public Garage(String s){
        garage = new Venicle[0];

    }
    public Venicle[] getGarage() {
        return garage;
    }

    public void setGarage(Venicle[] garage) {
        this.garage = garage;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Garage(Venicle[] garage, int count) {
       garage = new Venicle[count];

        for (int i = 0; i < count; i++) {
            garage[i]= new Venicle (" ");
        }
        count = 0;
       /* public void addVenicle(com.company.Classes.Venicle) { // OverLoad
            com.company.Classes.Venicle[] temp = Arrays.copyOf(garage, garage.length + 1);
            temp[garage.length] = com.company.Classes.Venicle;
            this.garage = temp;*/
    }
}
