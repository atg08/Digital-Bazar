package main.utils;

import main.controllers.PurchaseManager;
import main.controllers.Store;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuManagerAdmin implements IMenuManager {

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

    private static MenuManagerAdmin instance;

    private MenuManagerAdmin(){}

    public static MenuManagerAdmin getInstance(){
        if (instance == null){
            instance = new MenuManagerAdmin();
        }
        return instance;
    }

}
