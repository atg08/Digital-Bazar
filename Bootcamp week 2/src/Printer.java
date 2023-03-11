public class Printer extends Device {

    private int ppm;

    public Printer(String name, String description, int ppm) {
        super(name, description);
        setPpm(ppm);
    }

    public void setPpm(int ppm) {
        this.ppm = ppm;
    }

    public int getPpm() {
        return ppm;
    }

    @Override
    public String toString() {
        return "Printer" + super.toString()+
                " | ppm=" + ppm;
    }
}