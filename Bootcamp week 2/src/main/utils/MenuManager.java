package main.utils;

import java.util.Scanner;

public class MenuManager {

    //creating a menu to choose from

    public static int menuItem() {
        Scanner sel = new Scanner(System.in);

        System.out.println("\n1) New main.models.Computer");
        System.out.println("2) New main.models.Printer");
        System.out.println("3) List Computers");
        System.out.println("4) List Printers");
        System.out.println("5) Exit");
        System.out.print("Select one:");
        int choice = Integer.parseInt(sel.nextLine());
        System.out.println("Your choice:"+choice);
        return choice;
    }
}
