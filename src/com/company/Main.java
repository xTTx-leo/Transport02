package com.company;

import com.company.Person.Person;
import com.company.Transport.Aircraft;

public class Main {

    public static void main(String[] args) {
        Person person=new Person();
        Aircraft aircraft=new Aircraft();
        person.driveTransport(aircraft);
    }
}
