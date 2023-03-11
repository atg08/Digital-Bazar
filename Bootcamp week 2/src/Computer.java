public class Computer extends Device {

    private String manufacture;

    public Computer(String name, String description, String manufacture) {
        super(name, description);
        setManufacture(manufacture);
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getManufacture() {
        return manufacture;
    }

    @Override
    public String toString() {
        return "Computer" + super.toString() +
                " | manufacture: " + getManufacture();
    }
}
