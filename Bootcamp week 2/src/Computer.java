public class Computer extends Device {

    //string attribute
    private String manufacture;

    //constructor
    public Computer(String name, String description, String manufacture) {
        super(name, description);
        setManufacture(manufacture);
        setId(this.generateId());
    }

    //setter setManufacture
    public void setManufacture(String manufacture) {

        this.manufacture = manufacture;
    }

    //getter getManufacture
    public String getManufacture() {

        return manufacture;
    }


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
