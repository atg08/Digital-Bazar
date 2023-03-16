public class Store {
    //class to create and manage computers and printers

    //attributes which are arrays of each class
    private Computer[] computers;
    private Printer[] printers;

    //method with length of arrays as parameters which makes array
    public void initStore(int lengthOfComp , int lengthOfPrinter) {
        this.computers = new Computer[lengthOfComp];
        this.printers = new Printer[lengthOfPrinter];

    }

    //method that creates computers
    public void createComputers(){

        computers[0] = new Computer("XPS", "Laptop 16 inch", "Dell");
        computers[1] = new Computer("iMac", "Desltop 27 inch", "Apple");
        computers[2] = new Computer("Thinkpad", "Laptop 14 inch", "Lenovo");

    }

    //method that creates printers
    public void createPrinters(){
        printers[0] = new Printer("XPS", "Laptop 16 inch", 10);
        printers[1] = new Printer("iMac", "Desltop 27 inch", 10);

    }

    //prints computers
    public void printComputers(){
        for (int i =0; i<computers.length;i++){
            System.out.println("Computer (" + (i+1) + ") Type " + computers[i]);

        }


    }

    //prints printers
    public void printPrinters(){
        for (int i =0; i<printers.length;i++) {
            System.out.println("Printer ("+(i+1)+ ") Type "+ printers[i]);
        }

    }

    //method to call all the other methods
    public void runBazar(){
        initStore(3, 2);
        createComputers();
        createPrinters();
        printComputers();
        printPrinters();
    }

}

