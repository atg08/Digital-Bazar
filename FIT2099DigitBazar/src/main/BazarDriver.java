package main;

import main.controllers.PurchaseManager;
import main.controllers.Store;
import main.utils.IMenuManager;
import main.utils.MenuManagerAdmin;
import main.utils.MenuManagerEmployee;

/**
 * Creating the driver class named BazarDriver that runs the code
 * @author Aditti Gupta
 * @version 1.0.0
 */

public class BazarDriver {
    public static void main(String[] args) {
        try {
            PurchaseManager purchaseManager = PurchaseManager.getInstance();
            IMenuManager menuManager = MenuManagerAdmin.getInstance();
            Store store = Store.getInstance(purchaseManager, menuManager);
            store.runBazar();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
