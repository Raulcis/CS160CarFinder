package com.example.carfinder;

public class Car {
    public int carid;
    public String make;
    public String model;
    public int price;
    public int year;
    public int doors;
    public String fueltype;
    public int epapassenger;
    public String transmission;
    public String engine;
    public double weight;
    public double length;
    public double width;
    public int towingcapacity;
    public double trunkcapacity;
    public int horsepower;
    public int horsepowerrpm;
    public int torque;
    public int torquerpm;
    public int mpgcity;
    public int mpghighway;
    public int mpgcombined;
    public boolean luxury;
    public boolean sport;
    
    public int getCarid() {
        return carid;
    }

    public void setCarid(int carid) {
        this.carid = carid;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    public int getEpapassenger() {
        return epapassenger;
    }

    public void setEpapassenger(int epapassenger) {
        this.epapassenger = epapassenger;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getTowingcapacity() {
        return towingcapacity;
    }

    public void setTowingcapacity(int towingcapacity) {
        this.towingcapacity = towingcapacity;
    }

    public double getTrunkcapacity() {
        return trunkcapacity;
    }

    public void setTrunkcapacity(double trunkcapacity) {
        this.trunkcapacity = trunkcapacity;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getHorsepowerrpm() {
        return horsepowerrpm;
    }

    public void setHorsepowerrpm(int horsepowerrpm) {
        this.horsepowerrpm = horsepowerrpm;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public int getTorquerpm() {
        return torquerpm;
    }

    public void setTorquerpm(int torquerpm) {
        this.torquerpm = torquerpm;
    }

    public int getMpgcity() {
        return mpgcity;
    }

    public void setMpgcity(int mpgcity) {
        this.mpgcity = mpgcity;
    }

    public int getMpghighway() {
        return mpghighway;
    }

    public void setMpghighway(int mpghighway) {
        this.mpghighway = mpghighway;
    }

    public int getMpgcombined() {
        return mpgcombined;
    }

    public void setMpgcombined(int mpgcombined) {
        this.mpgcombined = mpgcombined;
    }

    public boolean isLuxury() {
        return luxury;
    }

    public void setLuxury(boolean luxury) {
        this.luxury = luxury;
    }

    public boolean isSport() {
        return sport;
    }

    public void setSport(boolean sport) {
        this.sport = sport;
    }

    public String toString() {
        return (carid + " - " + make + " - " + model + " - " + year + " - " + price + " - " + weight);
    }

}