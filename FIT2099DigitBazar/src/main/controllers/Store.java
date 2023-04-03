package main.controllers;

import main.models.devices.Computer;
import main.models.devices.Device;
import main.models.devices.Printer;
import main.models.purchases.InStorePurchase;
import main.models.purchases.OnlinePurchase;
import main.utils.IMenuManager;
import main.utils.MenuManagerAdmin;
import main.utils.PurchaseType;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Store implements IData {
    //class to create and manage computers and printers

    //using ArrayLists instead of Arrays
    private ArrayList<Computer> computers = new ArrayList<>();
    private ArrayList<Printer> printers = new ArrayList<>();
    private ArrayList<Device> device = new ArrayList<>();
    private PurchaseManager purchaseManager;
    private IMenuManager menuManager;


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
        try {
            Computer aComputer = new Computer(name, description, manufacture);
            computers.add(aComputer);
            device.add(aComputer);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
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

    public Store(PurchaseManager pm, IMenuManager mm){
        this.purchaseManager = pm;
        this.menuManager = mm;

    }
    //comment

    public void printPurchases(){
        purchaseManager.printPurchases();
    }

    @Override
    public boolean isDeviceAvailable(int id) {
        for (int i =0; i<device.size();i++){
            if (id == device.get(i).getId()){
                return true;
            }
        }
        return false;
    }

}

