package main.models.devices;

import main.models.devices.Device;
import main.utils.Utils;

public class Printer extends Device {

    //string attribute
    private int ppm;

    //constructor
    public Printer(String name, String description, int ppm) throws Exception {
        super(name, description);
        if (setPpm(ppm)) {
            setPpm(ppm);
            setId(this.generateId());
        }else {
            throw new Exception("Invalid ppm value");
        }
    }

    //setter setPpm
    public boolean setPpm(int ppm) {

        if (Utils.intergerRange(ppm, 1 , 50)) {

            this.ppm = ppm;
            return true;
        }
        return false;
    }

    //getter getPpm
    public int getPpm() {

        return ppm;
    }

    //setting ID range for printers
    @Override
    public int generateId() {

        return Utils.nextID(100,1000);
    }



    //toString method
    @Override
    public String toString() {
        return "Printer" + super.toString()+
                " | PPM=" + getPpm();
    }
}