package main.models.devices;

import main.utils.Utils;

//making device an abstract class
public abstract class Device {

    // attributes

    private String name;
    private String description;
    private int id;

    //constructor with two parameters
    public Device(String name,String description) throws Exception {
        if (setName(name) && setDescription(description)){
            setName(name);
            setDescription(description);
        }else {
            throw new Exception("Invalid name or description input values");
        }
    }

    //creating an abstract method
    public abstract int generateId();

    //setter setName
    public boolean setName(String name) {

        if (Utils.stringLength(name, 3 , 15)) {

            this.name = name;
            return true;
        }
        return false;
    }
    //getter getName
    public String getName() {

        return name;
    }

    //setter setDescription
    public boolean setDescription(String description) {

        if (Utils.stringLength(description, 5 , 20)) {

            this.description = description;
            return true;
        }
        return false;

    }

    //getter getDescription
    public String getDescription() {

        return description;
    }


    //setter for abstract method
    public void setId(int id) {

        this.id = id;
    }

    //getter for abstract method
    public int getId() {

        return id;
    }

    //toString method
    @Override
    public String toString() {
        return " | name: " + getName()+
                " | description: " + getDescription();
    }
}

