public class BazarDriver {

    //creates an instance of class "Store" and calling its method "runBazar"
    public static void main(String[] args) {

        Store store = new Store();

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
                case 5:
                    System.exit(0);
            }
        } while (selection != 5);
    }

}
