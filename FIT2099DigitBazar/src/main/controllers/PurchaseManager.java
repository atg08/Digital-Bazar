package main.controllers;

import main.models.Purchase;

import java.util.ArrayList;

public class PurchaseManager {

    private ArrayList<Purchase> purchase;

    public void makePurchase(IData devices, Purchase data) {
        if (devices.isDeviceAvailable(data.getDeviceID())) {
            purchase.add(data);
        }

    }

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


    private static  PurchaseManager instance;

    private PurchaseManager(){
        this.purchase = new ArrayList<>();
    }

    public static PurchaseManager getInstance(){
        if (instance == null){
            instance = new PurchaseManager();
        }
        return instance;
    }

}
