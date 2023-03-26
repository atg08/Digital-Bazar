package main;

import main.controllers.PurchaseManager;
import main.controllers.Store;
import main.utils.MenuManager;

import static main.utils.MenuManager.menuItem;

public class BazarDriver {

    //creates an instance of class "main.controllers.Store" and takes menu options from main.utils.MenuManager class
    public static void main(String[] args) {

        MenuManager menuManager = new MenuManager();
        Store store = new Store(PurchaseManager.getInstance() , menuManager);

        //adding console I/O
        int selection;
        do {
            selection = menuItem();
            switch (selection) {
                case 1:
                    store.createComputers();
                    break;
                case 2:
                    store.createPrinters();
                    break;
                case 3:
                    store.createPurchase();
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
        } while (selection != 7);
    }

}
