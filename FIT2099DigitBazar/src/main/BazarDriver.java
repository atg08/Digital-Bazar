package main;

import main.controllers.PurchaseManager;
import main.controllers.Store;
import main.utils.IMenuManager;
import main.utils.MenuManagerAdmin;
import main.utils.MenuManagerEmployee;

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
