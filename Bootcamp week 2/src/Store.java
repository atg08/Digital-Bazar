import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    //class to create and manage computers and printers

    //using ArrayLists instead of Arrays
    private ArrayList<Computer> computers = new ArrayList<>();
    private ArrayList<Printer> printers = new ArrayList<>();


    public void initStore(int lengthOfComp , int lengthOfPrinter) {
        this.computers = new ArrayList<>(lengthOfComp);
        this.printers = new ArrayList<>(lengthOfPrinter);

    }

    //method that creates computers with users input
    public void createComputers() {
        String name, description, manufacture;
        Scanner sel = new Scanner(System.in);
        System.out.print("Enter Device Name:");
        name = sel.nextLine();
        System.out.print("Enter Device Description:");
        description = sel.nextLine();
        System.out.print("Enter Computer Manufacture: ");
        manufacture = sel.next();
        Computer aComputer = new Computer(name, description, manufacture);
        computers.add(aComputer);
    }

    //method that creates printers with users input
    public void createPrinters() {
        String name, description;
        int ppm;
        Scanner sel = new Scanner(System.in);
        System.out.print("Enter Device Name:");
        name = sel.nextLine();
        System.out.print("Enter Device Description:");
        description = sel.nextLine();
        System.out.print("Enter the number of pages per minute: ");
        ppm = sel.nextInt();
        Printer aPrinter = new Printer(name, description, ppm);
        printers.add(aPrinter);
    }

    //prints computers
    public void printComputers(){
        for (int i =0; i<computers.size();i++){
            System.out.println("Computer (" + (i+1) + ") ID: "+ computers.get(i).getId()+ " | Type: " + computers.get(i));

        }

    }

    //prints printers
    public void printPrinters(){
        for (int i =0; i<printers.size();i++) {
            System.out.println("Printer ("+(i+1)+ ") ID: " + printers.get(i).getId()+ " | Type: "+ printers.get(i));
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

