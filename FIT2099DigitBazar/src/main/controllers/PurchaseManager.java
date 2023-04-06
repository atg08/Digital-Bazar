package main.controllers;

import main.models.purchases.Purchase;

import java.util.ArrayList;

/**
* creating the PurchaseManager class
* @author Aditti Gupta
* @version 1.0.0
* @see Store
*/

public class PurchaseManager {

    /**
     * attribute - initialising an ArrayList called purchase to store data
     */
    private ArrayList<Purchase> purchase;

    /**
     * method - makePurchase to create purchases after checking of the device is available
     * @param devices of type IData
     * @param data of type Purchase
     */

    public void makePurchase(IData devices, Purchase data) {
        if (devices.isDeviceAvailable(data.getDeviceID())) {
            purchase.add(data);
        }
    }

    /**
     * method - printPurchase to print out the purchases made
     */
    public void printPurchases() {
        String leftAlignFormat = "| %-5d | %-5d | %-10d | %-15s | %-8s |%n";
        String leftAlignFormatHeader = "| %-5s | %-5s | %-10s | %-15s | %-8s |%n";

        String header=String.format(leftAlignFormatHeader, "P-I","C-I","D-ID","Date","Type");
        int headerLen=header.length()-1; // -1 to ignore the return key
        String border = String.format("%" + headerLen + "s", " ").replace(' ', '-');
        System.out.format("%s\n", border);

        System.out.format(leftAlignFormatHeader, "P-I","C-I","D-ID","Date","Type");
        System.out.format("%s\n", border);

        for (int i = 0; i < purchase.size(); i++) {
            System.out.format(leftAlignFormat, purchase.get(i).getPurchaseID(), purchase.get(i).getCustomerID(),purchase.get(i).getDeviceID() , purchase.get(i).getDate(), purchase.get(i).getPurchaseType());
        }
        System.out.format("%s\n", border);
        }


    /**
     * Creating an instance of PurchaseManager
     */
    private static PurchaseManager instance;

    /**
     * Private constructor - PurchaseManager
     */

    private PurchaseManager(){

        this.purchase = new ArrayList<>();
    }

    /**
     * method - getInstance() to get only one instance of the object
     * @return instance that was created or instance what was pre-existing
     */
    public static PurchaseManager getInstance(){
        if (instance == null){
            instance = new PurchaseManager();
        }
        return instance;
    }

}
