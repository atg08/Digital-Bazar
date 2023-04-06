package main.utils;

import main.controllers.Store;
import java.util.Scanner;

/**
 * Creating a class named MenuManagerAdmin that implements from the interface called
 * @author Aditti Gupta
 * @version 1.0.0
 * @see Store
 * @see IMenuManager
 */

public class MenuManagerAdmin implements IMenuManager {

    /**
     * method - menuItem - that displays a list of available options
     * @return choice - the number chosen by the customer
     */
    public int menuItem() {
        Scanner sel = new Scanner(System.in);

        System.out.println("1) New Computer");
        System.out.println("2) New Printer");
        System.out.println("3) New Purchase");
        System.out.println("4) List Computers");
        System.out.println("5) List Printers");
        System.out.println("6) List Purchases");
        System.out.println("7) Exit");
        System.out.print("Select one:");
        int choice = 0;
        try {
            choice = Integer.parseInt(sel.nextLine());
            System.out.println("Your choice:" + choice);
        }catch (NumberFormatException e) {
            System.out.println("Invalid input - use integer");
        }
        return choice;
    }

    /**
     * Creating an instance
     */
    private static MenuManagerAdmin instance;

    /**
     * Private constructor
     */
    private MenuManagerAdmin(){}

    /**
     * method - getInstance() to get only one instance of the object
     * @return instance that was created or instance what was pre-existing
     */
    public static MenuManagerAdmin getInstance(){
        if (instance == null){
            instance = new MenuManagerAdmin();
        }
        return instance;
    }

}
