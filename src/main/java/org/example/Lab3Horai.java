package org.example;

import java.util.Arrays;
import java.util.Comparator;
/**
 * A simple application that creates the Airplane class, sorts an array of its objects by specified fields, and outputs the results.
 * @author Kseniia Horai
 * @version 1.0
 */
public class Lab3Horai {
    /**
     * The main method of the program. It creates an array of "Airplane" objects, sorts them: ASCENDING ORDER - NAME; DESCENDING ORDER - MAXSPEED, and prints the sorting results.
     *
     * @param args Arguments
     */
    public static void main(String[] args) {
        Airplane[] airplaneArray = new Airplane[]{
                new Airplane("Boeing", 900, 15000, "Jet", 400),
                new Airplane("Airbus", 1020, 16000, "Jet", 500),
                new Airplane("Concorde", 2180, 6400, "Jet", 100),
                new Airplane("Boeing", 850, 6000, "Jet", 200),
                new Airplane("Airbus", 870, 6100, "Jet", 180),
                new Airplane("Lockheed Martin", 2410, 2960, "Jet", 1),
                new Airplane("Cessna", 226, 1300, "Piston", 4),
                new Airplane("McDonnell Douglas", 2655, 5000, "Jet", 2),
                new Airplane("Gulfstream", 982, 13000, "Jet", 18),
                new Airplane("Cessna", 982, 13500, "Jet", 19),
                new Airplane("Embraer", 870, 4500, "Jet", 100),
                new Airplane("Concorde", 870, 4000, "Jet", 108),
                new Airplane("Piper", 185, 800, "Piston", 4),
                new Airplane("Lockheed Martin", 480, 2400, "Piston", 21),
                new Airplane("Boeing", 913, 15700, "Jet", 242),
                new Airplane("Airbus", 930, 16000, "Jet", 300)
        };

        System.out.println("Airplanes before sorting:");
        for (Airplane piece : airplaneArray) {
            System.out.println(piece);
        }

        Arrays.sort(airplaneArray, Comparator
                .comparing(Airplane::getName)
                .thenComparing(Airplane::getCost, Comparator.reverseOrder()));

        System.out.println("\nAirplanes after sorting: ASCENDING ORDER - NAME; DESCENDING ORDER - MAXSPEED");
        for (Airplane piece : airplaneArray) {
            System.out.println(piece);
        }
    }

}