package com.company.Classes;

public class Plane extends Venicle {

    private int hight;
    private int passagir;

    @Override
    public String toString() {
        return super.toString()+"plane";
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public int getPassagir() {
        return passagir;
    }

    public void setPassagir(int passagir) {
        this.passagir = passagir;
    }

    public Plane(String id, double cost, double speed, int year, int hight, int passagir) {
        super(id, cost, speed, year);
        this.hight = hight;
        this.passagir = passagir;

    }
}
