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
        for (int i = 0; i < purchase.size(); i++) {
            System.out.println("Purchase (" + (i + 1) + ") Purchase ID : " + purchase.get(i).getPurchaseID() + "customer ID: " + purchase.get(i).getCustomerID() + " | device ID: " + purchase.get(i).getDeviceID() + "date " + purchase.get(i).getDate() + "Purchase type " + purchase.get(i).getPurchaseType());
        }
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
