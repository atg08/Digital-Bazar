package main.models.purchases;


import main.utils.PurchaseType;
import main.utils.Utils;

/**
 * Creating a subclass of Purchase named InStorePurchase
 * @author Aditti Gupta
 * @version 1.0.0
 * @see Purchase
 */

public class InStorePurchase extends Purchase {

    /**
     * attribute - initialising String storeLocation - to enter the location of the store
     */
    private String storeLocation;

    /**
     * method - InStorePurchase - to keep track of purchases made from the in-store option by the customer
     * @param customerID to enter the ID of the customer - of type int
     * @param deviceID to enter the ID of the device that was previously purchased - of type int
     * @param date the date of purchase of type String
     * @param purchaseType to specify what type of purchase it is - of type PurchaseType
     * @param storeLocation to add in the location of the store the device is bought from - of type String
     * @throws Exception when the input out of the specified range
     */
    public InStorePurchase(int customerID, int deviceID, String date, PurchaseType purchaseType, String storeLocation) throws Exception {
        super(customerID, deviceID, date, purchaseType);
        if (setStoreLocation(storeLocation)){
            setStoreLocation(storeLocation);
        }else {
            throw new Exception("Invalid range of location");
        }
    }

    /**
     * setter - setStoreLocation
     * @param storeLocation to set the location of the store
     * @return a boolean value depending on the specified range
     */

    public boolean setStoreLocation(String storeLocation) {
        if (Utils.stringLength(storeLocation, 3 , 10)) {

            this.storeLocation = storeLocation;
            return true;
        }
        return false;
    }

    /**
     * getter - getStoreLocation
     * @return storeLocation - the location of the store
     */
    public String getStoreLocation() {

        return storeLocation;
    }
}
