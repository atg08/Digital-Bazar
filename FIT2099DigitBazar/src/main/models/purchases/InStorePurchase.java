package main.models.purchases;


import main.utils.PurchaseType;
import main.utils.Utils;

public class InStorePurchase extends Purchase {

    private String storeLocation;

    public InStorePurchase(int customerID, int deviceID, String date, PurchaseType purchaseType, String storeLocation) throws Exception {
        super(customerID, deviceID, date, purchaseType);
        if (setStoreLocation(storeLocation)){
            setStoreLocation(storeLocation);
        }else {
            throw new Exception("Invalid range of location");
        }
    }

    public boolean setStoreLocation(String storeLocation) {
        if (Utils.stringLength(storeLocation, 3 , 10)) {

            this.storeLocation = storeLocation;
            return true;
        }
        return false;
    }

    public String getStoreLocation() {

        return storeLocation;
    }
}
