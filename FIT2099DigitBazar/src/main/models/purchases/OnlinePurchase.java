package main.models.purchases;

import main.utils.PurchaseType;
import main.utils.Utils;


/**
 * Creating a subclass of Purchase named OnlinePurchase
 * @author Aditti Gupta
 * @version 1.0.0
 * @see Purchase
 */

public class OnlinePurchase extends Purchase {

    /**
     * attribute - initialising String deliveryAddress - to enter the address of the customer to deliver the specified device
     */
    private String deliveryAddress;

    /**
     * method - OnlinePurchase - to keep track of purchases made from the online option by the customer
     * @param customerID to enter the ID of the customer - of type int
     * @param deviceID to enter the ID of the device that was previously purchased - of type int
     * @param date the date of purchase of type String
     * @param purchaseType to specify what type of purchase it is - of type PurchaseType
     * @param deliveryAddress to add in the address of the customer to deliver the device - of type String
     * @throws Exception when the input out of the specified range
     */
    public OnlinePurchase(int customerID, int deviceID, String date, PurchaseType purchaseType, String deliveryAddress) throws Exception {
        super(customerID, deviceID, date, purchaseType);
        if (setDeliveryAddress(deliveryAddress)){
            setDeliveryAddress(deliveryAddress);
        } else {
            throw new Exception("Invalid range of location");
        }

    }

    /**
     * setter - deliveryAddress
     * @param deliveryAddress to set the delivery address of the customer
     * @return a boolean value depending on the specified range
     */
    public boolean setDeliveryAddress(String deliveryAddress) {

        if (Utils.stringLength(deliveryAddress, 5 , 20)) {

            this.deliveryAddress = deliveryAddress;
            return true;
        }
        return false;
    }
    /**
     * getter - getDeliveryAddress
     * @return deliveryAddress - the delivery address of the customer
     */
    public String getDeliveryAddress() {
        return deliveryAddress;
    }
}
