public class Store {

    private Computer[] computers;
    private Printer[] printers;

    public void initStore(int lenghtOfComp , int lengthOfPrinter) {
        this.computers = new Computer[lenghtOfComp];
        this.printers = new Printer[lengthOfPrinter];

    }

    public void createComputers(){

        computers[0] = new Computer("XPS", "Laptop 16 inch", "Dell");
        computers[1] = new Computer("iMac", "Desltop 27 inch", "Apple");
        computers[2] = new Computer("Thinkpad", "Laptop 14 inch", "Lenovo");

    }

    public void createPrinters(){
        printers[0] = new Printer("XPS", "Laptop 16 inch", 10);
        printers[1] = new Printer("iMac", "Desltop 27 inch", 10);

    }

    public void printComputers(){
        for (int i =0; i<computers.length;i++){
            System.out.println("Computer (" + (i+1) + ") Type " + computers[i]);

        }


    }
    public void printPrinters(){
        for (int i =0; i<printers.length;i++) {
            System.out.println("Printer ("+(i+1)+ ") Type"+ printers[i]);
        }

    }
    public void runBazar(){
        initStore(3, 2);
        createComputers();
        createPrinters();
        printComputers();
        printPrinters();
    }

}

