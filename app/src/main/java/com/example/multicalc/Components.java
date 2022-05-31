package com.example.multicalc;

public class Components {

    public double getMass() {
        return Mass;
    }

    public void setMass(double mass) {
        Mass = mass;
    }

    public double getMforce() {
        return mforce;
    }

    public void setMforce(double mforce) {
        this.mforce = mforce;
    }

    public double getMacceleration() {
        return macceleration;
    }

    public void setMacceleration(double macceleration) {
        this.macceleration = macceleration;
    }

    //mass
    private double Mass, mforce, macceleration;

    public double getForce() {
        return Force;
    }

    public void setForce(double force) {
        Force = force;
    }

    public double getFmass() {
        return fmass;
    }

    public void setFmass(double fmass) {
        this.fmass = fmass;
    }

    public double getFacceleration() {
        return facceleration;
    }

    public void setFacceleration(double facceleration) {
        this.facceleration = facceleration;
    }

    //force
    private double Force, fmass, facceleration;

    public double getPressure() {
        return Pressure;
    }

    public void setPressure(double pressure) {
        Pressure = pressure;
    }

    public double getPforce() {
        return pforce;
    }

    public void setPforce(double pforce) {
        this.pforce = pforce;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    //pressure
    private double Pressure, pforce, area;

    public double getSpeed() {
        return Speed;
    }

    public void setSpeed(double speed) {
        Speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    //speed
    private double Speed, distance, time;



}
