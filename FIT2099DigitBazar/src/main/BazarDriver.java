package main;

import main.controllers.PurchaseManager;
import main.controllers.Store;
import main.utils.IMenuManager;
import main.utils.MenuManagerAdmin;
import main.utils.MenuManagerEmployee;

public class BazarDriver {


    public static void main(String[] args) {

        IMenuManager menuManagerAdmin = new MenuManagerAdmin();
        Store store = new Store(PurchaseManager.getInstance() , menuManagerAdmin);

        //adding console I/O
        int selection;
        do {
            selection = menuManagerAdmin.menuItem();
            switch (selection) {
                case 1:
                    store.createComputers();
                    break;
                case 2:
                    store.createPrinters();
                    break;
                case 3:
                    store.createPurchase();
                    break;
                case 4:
                    store.printComputers();
                    break;
                case 5:
                    store.printPrinters();
                    break;
                case 6:
                    store.printPurchases();
                    break;

                default: System.exit(0);
            }
        } while (selection != 7) ;

    }

}
