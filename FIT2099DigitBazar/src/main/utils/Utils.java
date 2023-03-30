package main.utils;

import java.util.Random;

//creating utils class to implement the abstract method in computer and printer
public class Utils {
    public static int nextID(int low, int high) {
        Random r = new Random();
        return (r.nextInt(high - low) + low);
    }
}