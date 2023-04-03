package main.utils;

import java.util.Random;

//creating utils class to implement the abstract method in computer and printer
public class Utils {
    public static int nextID(int low, int high) {
        Random r = new Random();
        return (r.nextInt(high - low) + low);

    }


    public static boolean stringLength(String word, int lower, int upper ) {
        boolean flag = false;

        if (word.length() >= lower && word.length() <= upper) {
            flag = true;
        }
        return flag;

    }

    public static boolean intergerRange(int word, int lower, int upper ) {
        boolean flag = false;

        if (word >= lower && word <= upper) {
            flag = true;
        }
        return flag;

    }



}