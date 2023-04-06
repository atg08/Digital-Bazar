package main.models.devices;

import main.utils.Utils;


/**
 * Creating a subclass of Device named Printer
 * @author Aditti Gupta
 * @version 1.0.0
 * @see Device
 */
public class Printer extends Device {

    /**
     * attribute - initialising int ppm - pages per minute
     */
    private int ppm;

    /**
     * Constructor - Printer
     * @param name of the printer of type String
     * @param description of the printer of type String
     * @param ppm of the printer of type int
     * @throws Exception when setPpm(ppm) is false
     */
    public Printer(String name, String description, int ppm) throws Exception {
        super(name, description);
        if (setPpm(ppm)) {
            setPpm(ppm);
            setId(this.generateId());
        }else {
            throw new Exception("Invalid ppm value");
        }
    }

    /**
     * setter - setPpm
     * @param ppm setting Manufacture of type int
     * @return boolean value true or false
     */
    public boolean setPpm(int ppm) {
        if (Utils.intergerRange(ppm, 1 , 50)) {
            this.ppm = ppm;
            return true;
        }
        return false;
    }

    /**
     * getter - getPpm
     * @return ppm
     */
    public int getPpm() {
        return ppm;
    }

    /**
     * method - generateId to generate a random ID from a given range
     * @return id from Utils with the specified range
     */
    @Override
    public int generateId() {

        return Utils.nextID(100,1000);
    }

    /**
     * method - toString
     * @return a string containing specified details
     */
    @Override
    public String toString() {
        return "Printer" + super.toString()+
                " | PPM=" + getPpm();
    }
}