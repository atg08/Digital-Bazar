package main.models.devices;

import main.utils.Utils;

/**
 * Creating a subclass of Device named Computer
 * @author Aditti Gupta
 * @version 1.0.0
 * @see Device
 */

public class Computer extends Device {

    /**
     * attribute - initialising string manufacture
     */
    private String manufacture;


    /**
     * Constructor - Computer
     * @param name of the computer of type String
     * @param description of the computer of type String
     * @param manufacture of the computer of type String
     * @throws Exception when setManufacture(manufacture) is false
     */

    public Computer(String name, String description, String manufacture) throws Exception {
        super(name, description);
        if (setManufacture(manufacture)) {
            setManufacture(manufacture);
            setId(this.generateId());
        }else {
            throw new Exception("Invalid manufacture value");
        }
    }

    /**
     * setter - setManufacture
     * @param manufacture setting Manufacture of type string
     * @return boolean value true or false depending on the specified range
     */
    public boolean setManufacture(String manufacture) {
        if (Utils.stringLength(manufacture, 3 , 15)) {

            this.manufacture = manufacture;
            return true;
        }
        return false;
    }


    /**
     * getter - getManufacture
     * @return manufacture
     */
    public String getManufacture() {

        return manufacture;
    }

    /**
     * method - generateId to generate a random ID from a given range
     * @return id from Utils with the specified range
     */
    @Override
    public int generateId() {

        return Utils.nextID(100000,10000000);
    }

    /**
     * method - toString
     * @return a string containing specified details
     */
    @Override
    public String toString() {
        return "Computer" + super.toString() +
                " | manufacture: " + getManufacture();
    }
}
