package com.company.Person;


import com.company.Transport.*;

public class Person {
    int p_Age;
    String p_Sex;
    String id;
    String p_Name;

    public Person() {
    }

    public Person(String string) {
    }

    public void driveTransport(AirTransport airTransport) {
        airTransport.DrivingMethod();
    }

    public void driveTransport(LandTransport landTransport) {
        landTransport.DrivingMethod();
    }

    public void driveTransport(MartimeMeansOfTransport martimeMeansOfTransport) {
        martimeMeansOfTransport.DrivingMethod();
    }

    public int getP_Age() {
        return p_Age;
    }

    public void setP_Age(int p_Age) {
        this.p_Age = p_Age;
    }

    public String getP_Sex() {
        return p_Sex;
    }

    public void setP_Sex(String p_Sex) {
        this.p_Sex = p_Sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getP_Name() {
        return p_Name;
    }

    public void setP_Name(String p_Name) {
        this.p_Name = p_Name;
    }
}
