package main.models.purchases;

import main.utils.PurchaseType;
import main.utils.Utils;

public class OnlinePurchase extends Purchase {

    private String deliveryAddress;
    public OnlinePurchase(int customerID, int deviceID, String date, PurchaseType purchaseType, String deliveryAddress) throws Exception {
        super(customerID, deviceID, date, purchaseType);
        if (setDeliveryAddress(deliveryAddress)){
            setDeliveryAddress(deliveryAddress);
        } else {
            throw new Exception("Invalid range of location");
        }

    }

    public boolean setDeliveryAddress(String deliveryAddress) {

        if (Utils.stringLength(deliveryAddress, 5 , 20)) {

            this.deliveryAddress = deliveryAddress;
            return true;
        }
        return false;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }
}
