package main.models;

import main.utils.PurchaseType;

public class OnlinePurchase extends Purchase {

    private String deliveryAddress;
    public OnlinePurchase(int customerID, int deviceID, String date, PurchaseType purchaseType, String deliveryAddress) {
        super(customerID, deviceID, date, purchaseType);
        setDeliveryAddress(deliveryAddress);
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }
}
