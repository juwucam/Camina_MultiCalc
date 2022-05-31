package com.example.multicalc;

public class Formulas {
    //mass
    public double MassFormula(double force, double acceleration) {return force / acceleration;}
    //force
    public double ForceFormula(double mass, double acceleration) {return mass * acceleration;}
    //pressure
    public double PressureFormula(double force, double area) {return force / area;}
    //speed
    public double SpeedFormula(double distance, double time) {return distance / time;}
}
