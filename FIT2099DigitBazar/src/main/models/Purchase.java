package main.models;

import main.utils.PurchaseType;
import main.utils.Utils;

public abstract class Purchase {

        //attributes
        private int purchaseID;
        private int customerID;
        private int deviceID;
        private String date;
        private PurchaseType purchaseType;

        public Purchase(int customerID , int deviceID, String date, PurchaseType purchaseType ) {
            setPurchaseID(Utils.nextID(100,1000));
            setCustomerID(customerID);
            setDeviceID(deviceID);
            setDate(date);
            setPurchaseType(purchaseType);
    }

    public int getPurchaseID(){
            return purchaseID;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "purchaseID=" + purchaseID +
                ", customerID=" + customerID +
                ", deviceID=" + deviceID +
                ", date='" + date + '\'' +
                ", purchaseType=" + purchaseType +
                '}';
    }

    public String getDate() {

            return date;
    }

    public void setDate(String date) {

            this.date = date;
    }

    public int getDeviceID() {

            return deviceID;
    }

    public void setDeviceID(int deviceID) {

            this.deviceID = deviceID;
    }

    public int getCustomerID() {

            return customerID;
    }

    public void setCustomerID(int customerID) {

        this.customerID = customerID;
    }

    public void setPurchaseType(PurchaseType purchaseType) {

        this.purchaseType = purchaseType;
    }

    public PurchaseType getPurchaseType() {

        return purchaseType;
    }

    public void setPurchaseID(int purchaseID) {

            this.purchaseID = purchaseID;
    }
}
