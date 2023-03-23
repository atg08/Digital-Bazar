public class Printer extends Device {

    //string attribute
    private int ppm;

    //constructor
    public Printer(String name, String description, int ppm) {
        super(name, description);
        setPpm(ppm);
        setId(this.generateId());
    }

    //setter setPpm
    public void setPpm(int ppm) {

        this.ppm = ppm;
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