package main.models.purchases;

import main.utils.PurchaseType;
import main.utils.Utils;

/**
 * Creating an abstract class named Purchase
 * @author Aditti Gupta
 * @version 1.0.0
 * @see InStorePurchase
 * @see OnlinePurchase
 */

public abstract class Purchase {

    /**
     * attributes - initialising purchase ID , customer ID, device ID, date , purchaseType
     */
        private int purchaseID;
        private int customerID;
        private int deviceID;
        private String date;
        private PurchaseType purchaseType;

    /**
     * mrthod - Purchase - to keep track of all the purchases made by the customer
     * @param customerID to enter the ID of the customer - of type int
     * @param deviceID to enter the ID of the device that was previously purchased - of type int
     * @param date the date of purchase of type String
     * @param purchaseType to specify what type of purchase it is - of type PurchaseType
     * @throws Exception when the input out of the specified range
     */

    public Purchase(int customerID , int deviceID, String date, PurchaseType purchaseType ) throws Exception {
        if (setDate(date)) {
            setPurchaseID(Utils.nextID(100, 1000));
            setCustomerID(customerID);
            setDeviceID(deviceID);
            setPurchaseType(purchaseType);
            setDate(date);
        }else {
            throw new Exception("Invalid date value");
        }
    }

    /**
     * setter - setDate
     * @param date setting date of purchase
     * @return boolean value true or false depending on the specified range
     */
    public boolean setDate(String date) {

        if (Utils.stringLength(date, 8 , 8)) {

            this.date = date;
            return true;
        }
        return false;
    }

    /**
     * getter - getDate
     * @return date - date of purchase
     */
    public String getDate() {

            return date;
    }

    /**
     * setter - setDeviceId
     * @param deviceID setting device ID of the purchased device
     */
    public void setDeviceID(int deviceID) {

        this.deviceID = deviceID;
    }

    /**
     * getter - getDeviceId
     * @return deviceId - specified device ID received after purchase
     */
    public int getDeviceID() {

            return deviceID;
    }

    /**
     * setter - setCustomerId
     * @param customerID setting the input value of customer ID by the customer
     */
    public void setCustomerID(int customerID) {

        this.customerID = customerID;
    }

    /**
     * getter - getCustomerId
     * @return customerId - input value by the customer
     */
    public int getCustomerID() {

            return customerID;
    }


    /**
     * setter - setPurchaseType
     * @param purchaseType setting the type of purchase chosen by the customer - online or in-store
     */
    public void setPurchaseType(PurchaseType purchaseType) {

        this.purchaseType = purchaseType;
    }

    /**
     * getter - getPurchaseType
     * @return purchaseType - specifies if it was an online or in-store purchase
     */
    public PurchaseType getPurchaseType() {

        return purchaseType;
    }

    /**
     * setter - setPurchaseId
     * @param purchaseID setting the purchase ID with a random value from the specified range
     */
    public void setPurchaseID(int purchaseID) {

            this.purchaseID = purchaseID;
    }

    /**
     * getter - getPurchaseId
     * @return purchaseId - a random value from a specified range
     */
    public int getPurchaseID(){

        return purchaseID;
    }

    /**
     * method - toString
     * @return a string containing specified details
     */
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
}
