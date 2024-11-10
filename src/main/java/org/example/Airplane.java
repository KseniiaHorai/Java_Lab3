package org.example;

/**
 * The "Airplane" class defines different types of airplanes. SORT: ASCENDING ORDER - NAME; DESCENDING ORDER - MAXSPEED.
 */
class Airplane implements Comparable<Airplane> {
    private final String model;
    private final int maxSpeed;
    private final int range;
    private final String engine;
    private final int capacity;

    /**
     * Constructor for the "Airplane" class.
     *
     * @param model     The model of the airplane
     * @param maxSpeed     The maxSpeed of the airplane
     * @param range     The range of the airplane
     * @param engine     The engine of the airplane
     * @param capacity     The capacity of the airplane
     */
    public Airplane(String model, int maxSpeed, int range, String engine, int capacity) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.range  = range;
        this.engine = engine;
        this.capacity = capacity;
    }

    /**
     * Overridden compareTo method for sorting by maxSpeed.
     *
     * @param other The other "Airplane" object to compare with
     * @return The result of comparing the maxSpeeds of the airplanes
     */
    @Override
    public int compareTo(Airplane other) {
        return Integer.compare(this.maxSpeed, other.maxSpeed);
    }

    /**
     * Overridden toString method to represent the object as a string.
     *
     * @return A string representing the "Airplane" object
     */
    @Override
    public String toString() {
        return "Airplane { " +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", range=" + range +
                ", engine='" + engine + '\'' +
                ", capacity=" + capacity +
                " }";
    }

    public String getName() {
        return model;
    }

    public int getCost() {
        return maxSpeed;
    }
}
