package main.models.devices;

import main.utils.Utils;


/**
 * Creating an abstract class named Device
 * @author Aditti Gupta
 * @version 1.0.0
 * @see Computer
 * @see Printer
 */

public abstract class Device {
    /**
     * attributes - initialising name, description and id
     */
    private String name;
    private String description;
    private int id;

    /**
     *
     * @param name of device of type String
     * @param description of device of type String
     * @throws Exception when (setName(name) && setDescription(description)) is false
     */
    public Device(String name,String description) throws Exception {
        if (setName(name) && setDescription(description)){
            setName(name);
            setDescription(description);
        }else {
            throw new Exception("Invalid name or description input values");
        }
    }

    /**
     *
     * creating an abstract method - generateId()
     */
    public abstract int generateId();

    /**
     * setter - setName
     * @param name setting name of device
     * @return boolean value true or false depending on given range
     */
    public boolean setName(String name) {

        if (Utils.stringLength(name, 3 , 15)) {

            this.name = name;
            return true;
        }
        return false;
    }

    /**
     * getter - getName
     * @return boolean value true or false depending on given range
     */
    public String getName() {

        return name;
    }


    /**
     * setter - setDescription
     * @param description setting description of device
     * @return boolean value true or false depending on given range
     */
    public boolean setDescription(String description) {

        if (Utils.stringLength(description, 5 , 20)) {

            this.description = description;
            return true;
        }
        return false;

    }

    /**
     * getter - getDescription
     * @return boolean value true or false depending on given range
     */
    public String getDescription() {

        return description;
    }


    /**
     * setter - setId for abstract method
     * @param id of type int
     */
    public void setId(int id) {

        this.id = id;
    }

    /**
     * getter - getId for abstract method
     * @return id
     */
    public int getId() {

        return id;
    }

    /**
     * method - toString
     * @return a string containing specified details
     */
    @Override
    public String toString() {
        return " | name: " + getName()+
                " | description: " + getDescription();
    }
}

