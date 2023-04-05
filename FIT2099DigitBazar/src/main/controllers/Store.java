package main.controllers;

import main.models.devices.Computer;
import main.models.devices.Device;
import main.models.devices.Printer;
import main.models.purchases.InStorePurchase;
import main.models.purchases.OnlinePurchase;
import main.utils.IMenuManager;
import main.utils.MenuManagerEmployee;
import main.utils.PurchaseType;
import java.util.ArrayList;
import java.util.Scanner;



/**
 * Creating a class named Store that implements IData interface
 * @author Aditti Gupta
 * @version 1.0.0
 * @see Store
 * @see IData
 */

public class Store implements IData {
    /*
     * attributes - initialised to create new objects
     */
    private ArrayList<Computer> computers = new ArrayList<>();
    private ArrayList<Printer> printers = new ArrayList<>();
    private ArrayList<Device> device = new ArrayList<>();
    private PurchaseManager purchaseManager;
    private IMenuManager menuManager;


    /**
     * method - createComputers to create new computer with its name, description and manufacture
     */

    public void createComputers() {
        String name, description, manufacture;
        Scanner sel = new Scanner(System.in);
        System.out.print("Enter Device Name:");
        name = sel.nextLine();
        System.out.print("Enter Device Description:");
        description = sel.nextLine();
        System.out.print("Enter Computer Manufacture: ");
        manufacture = sel.next();
        try {
            Computer aComputer = new Computer(name, description, manufacture);
            computers.add(aComputer);
            device.add(aComputer);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * method - createPrinters to create new printer with its name, description and ppm
     */

    public void createPrinters() {
        String name, description;
        int ppm;
        Scanner sel = new Scanner(System.in);
        System.out.print("Enter Device Name:");
        name = sel.nextLine();
        System.out.print("Enter Device Description:");
        description = sel.nextLine();
        try {
            System.out.print("Enter the number of pages per minute: ");
            ppm = Integer.parseInt(sel.nextLine());
            Printer aPrinter = new Printer(name, description, ppm);
            printers.add(aPrinter);
            device.add(aPrinter);
        }catch (NumberFormatException e){
            System.out.println("Invalid input - use integer");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * method - createPurchase to create new purchase
     */

    public void createPurchase() {
        int customerID , deviceID , type;
        String date , location;

        Scanner sel = new Scanner(System.in);
        System.out.print("Enter Customer ID: ");
        customerID = Integer.parseInt(sel.nextLine());
        System.out.print("Enter Device ID: ");
        deviceID = Integer.parseInt(sel.nextLine());
        System.out.print("Enter the date (dd/mm/yy): ");
        date = sel.nextLine();
        System.out.print("Enter Type: (0 online) or (1 in store) ");
        type = Integer.parseInt(sel.nextLine());

        if (type == 0) {
            System.out.print("Enter Delivery address: ");
            location = sel.nextLine();
            try {
                OnlinePurchase onlinePurchase = new OnlinePurchase(customerID, deviceID, date, PurchaseType.ONLINE, location);
                purchaseManager.makePurchase(this, onlinePurchase);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }
        else{
            System.out.print("Enter Store address: ");
            location = sel.nextLine();
            try {
                InStorePurchase inStorePurchase = new InStorePurchase(customerID, deviceID, date, PurchaseType.IN_STORE, location);
                purchaseManager.makePurchase(this, inStorePurchase);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * method - printComputers to print the created computers
     */
    public void printComputers(){
        for (int i =0; i<computers.size();i++){
            System.out.println("Computer (" + (i+1) + ") ID: "+ computers.get(i).getId()+ " | Type: " + computers.get(i));
        }
    }

    /**
     * method - printPrinters to print the created printers
     */
    public void printPrinters(){
        for (int i =0; i<printers.size();i++) {
            System.out.println("Printer ("+(i+1)+ ") ID: " + printers.get(i).getId()+ " | Type: "+ printers.get(i));
        }
    }

    /**
     * method - printPurchases to print the created purchases
     */
    public void printPurchases(){

        purchaseManager.printPurchases();
    }

    /**
     * method - printComputers to print the created computers
     * @param id of type integer
     * @return boolean value tru or false
     */

    @Override
    public boolean isDeviceAvailable(int id) {
        for (int i =0; i<device.size();i++){
            if (id == device.get(i).getId()){
                return true;
            }
        }
        return false;
    }


    /**
     * Creating an instance
     */
    private static Store instance;

    /**
     * Private constructor
     */

    private Store(PurchaseManager pm, IMenuManager mm) {
        this.purchaseManager = pm;
        this.menuManager = mm;
    }

    /**
     * method - getInstance() to get only one instance of the object
     * @param pm of type PurchaseManager
     * @param mm of type IMenuManager
     * @return instance that was created or instance what was pre-existing
     */

    public static Store getInstance(PurchaseManager pm, IMenuManager mm){
        if (instance == null){
            instance = new Store(pm, mm);
        }
        return instance;
    }

    /**
     * method - runBazar()
     */

    public void runBazar() {
        int selection;
        do {
            selection = menuManager.menuItem();
            switch (selection) {
                case 1:
                    createComputers();
                    break;
                case 2:
                    createPrinters();
                    break;
                case 3:
                    createPurchase();
                    break;
                case 4:
                    printComputers();
                    break;
                case 5:
                    printPrinters();
                    break;
                case 6:
                    printPurchases();
                    break;

                default: System.exit(0);
            }
        } while (selection != 7) ;
    }
}

