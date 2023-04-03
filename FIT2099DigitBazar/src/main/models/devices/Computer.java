package main.models.devices;

import main.utils.Utils;

public class Computer extends Device {

    //string attribute
    private String manufacture;

    //constructor
    public Computer(String name, String description, String manufacture) throws Exception {
        super(name, description);
        if (setManufacture(manufacture)) {
            setManufacture(manufacture);
            setId(this.generateId());
        }else {
            throw new Exception("Invalid manufacture value");
        }
    }

    //setter setManufacture
    public boolean setManufacture(String manufacture) {
        if (Utils.stringLength(manufacture, 3 , 15)) {

            this.manufacture = manufacture;
            return true;
        }
        return false;
    }

    //getter getManufacture
    public String getManufacture() {

        return manufacture;
    }

    //setting ID range for computers
    @Override
    public int generateId() {

        return Utils.nextID(100000,10000000);
    }

    //toString method
    @Override
    public String toString() {
        return "Computer" + super.toString() +
                " | manufacture: " + getManufacture();
    }
}
