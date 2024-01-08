package com.name.module2_1;

import java.util.Objects;
public class Planet {

    //A class that represents a planet

    private String designation; // The designation of the planet

    private double massKg; // The mass of the planet in kilograms

    private double orbitEarthYears; // The time it takes for the planet to orbit the Earth in years

    private PlanetType type; // The type of the planet



    public Planet(String designation, PlanetType type){

        // Constructs a new Planet object with the given designation and type

        this.designation = designation;

        this.type = type;

    }



    public Planet(String designation, double massKg, double orbitEarthYears, PlanetType type) {

        //  Constructs a new Planet object with the given designation, mass, orbit time and type

        this.designation = designation;

        this.massKg = massKg;

        this.orbitEarthYears = orbitEarthYears;

        this.type = type;

    }

    @Override
    public int hashCode() {
        return Objects.hash(designation);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        if(this == obj){
            return true;
        }
        Planet otherPlanet = (Planet) obj;
        return Objects.equals(this.designation, otherPlanet.designation);
    }

    @Override
    public String toString() {
        return "Planet{" +
                "designation='" + designation + '\'' +
                ", type=" + type +
                '}';
    }
}