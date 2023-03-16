public class Printer extends Device {

    //string attribute
    private int ppm;

    //constructor
    public Printer(String name, String description, int ppm) {
        super(name, description);
        setPpm(ppm);
    }

    //setter setPpm
    public void setPpm(int ppm) {

        this.ppm = ppm;
    }

    //getter getPpm
    public int getPpm() {

        return ppm;
    }

    //toString method
    @Override
    public String toString() {
        return "Printer" + super.toString()+
                " | ppm=" + getPpm();
    }
}