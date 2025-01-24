package ru.itis.inf403.lab12.model;

public class Plane implements TransportAction{


    @Override
    public void move(City cityFrom, City cityTo, Passenger passenger){
        System.out.println(passenger + " moved by Plane from "
                            + cityFrom + " to " + cityFrom  );
    }
}
