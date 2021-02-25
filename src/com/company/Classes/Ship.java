package com.company.Classes;

public class Ship extends Venicle{
    private String port;
    private int passagir;

    @Override
    public String toString() {
        return super.toString()+port+passagir;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public int getPassagir() {
        return passagir;
    }

    public void setPassagir(int passagir) {
        this.passagir = passagir;
    }

    public Ship(String id, double cost, double speed, int year, String port, int passagir) {
        super(id, cost, speed, year);
        this.port = port;
        this.passagir = passagir;

    }
}
