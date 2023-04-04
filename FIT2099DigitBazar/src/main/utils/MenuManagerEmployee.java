package main.utils;

import java.util.Scanner;

public class MenuManagerEmployee implements IMenuManager{

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

    private static MenuManagerEmployee instance;

    private MenuManagerEmployee(){}

    public static MenuManagerEmployee getInstance(){
        if (instance == null){
            instance = new MenuManagerEmployee();
        }

        return instance;
    }
}

