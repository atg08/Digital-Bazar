package main.utils;

import main.controllers.Store;

import java.util.Scanner;

/**
 * Creating a class named MenuManagerEmployee that implements from the interface called
 * @author Aditti Gupta
 * @version 1.0.0
 * @see Store
 * @see IMenuManager
 */

public class MenuManagerEmployee implements IMenuManager{

    /**
     * method - menuItem - that displays a list of available options
     * @return choice - the number chosen by the customer
     */
    public int menuItem() {
        Scanner sel = new Scanner(System.in);

        System.out.println("1) New Computer");
        System.out.println("2) New Printer");
        System.out.println("3) New Purchase");
        System.out.println("4) Exit");
        System.out.print("Select one:");
        int choice = 0;
        try {
            choice = Integer.parseInt(sel.nextLine());
            if (choice < 4 && choice > 0) {
                System.out.println("Your choice:" + choice);
            }else {
                choice = -1;
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input - use integer");
        }
        return choice;
    }

    /**
     * Creating an instance
     */
    private static MenuManagerEmployee instance;

    /**
     * Private constructor
     */
    private MenuManagerEmployee(){}

    /**
     * method - getInstance() to get only one instance of the object
     * @return instance that was created or instance what was pre-existing
     */
    public static MenuManagerEmployee getInstance(){
        if (instance == null){
            instance = new MenuManagerEmployee();
        }
        return instance;
    }
}

