import main.controllers.Store;
import main.utils.MenuManager;

public class BazarDriver {

    //creates an instance of class "main.controllers.Store" and takes menu options from main.utils.MenuManager class
    public static void main(String[] args) {

        Store store = new Store();

        //adding console I/O
        int selection;
        do {
            selection = MenuManager.menuItem();
            switch (selection) {
                case 1:
                    store.createComputers();
                    break;
                case 2:
                    store.createPrinters();
                    break;
                case 3:
                    store.printComputers();
                    break;
                case 4:
                    store.printPrinters();
                    break;

                default: System.exit(0);
            }
        } while (selection != 5);
    }

}
