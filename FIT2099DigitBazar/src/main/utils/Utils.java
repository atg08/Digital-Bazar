package main.utils;

import java.util.Random;

/**
 * Creating a class named Utils that specifies ranges
 * @author Aditti Gupta
 * @version 1.0.0
 */

public class Utils {

    /**
     * method - nextId
     * @param low for lower bound in the range of random numbers
     * @param high for upper bound in the range of random numbers
     * @return (r.nextInt(high - low) + low)
     */
    public static int nextID(int low, int high) {
        Random r = new Random();
        return (r.nextInt(high - low) + low);
    }

    /**
     * method - stringLength - to specify the range
     * @param word input from the user
     * @param lower for lower bound in the range of random numbers
     * @param upper for upper bound in the range of random numbers
     * @return flag - boolean value true or false
     */
    public static boolean stringLength(String word, int lower, int upper ) {
        boolean flag = false;

        if (word.length() >= lower && word.length() <= upper) {
            flag = true;
        }
        return flag;
    }

    /**
     * method - integerRange - to specify the range
     * @param word input from the user
     * @param lower for lower bound in the range of random numbers
     * @param upper for upper bound in the range of random numbers
     * @return flag - boolean value true or false
     */

    public static boolean intergerRange(int word, int lower, int upper ) {
        boolean flag = false;

        if (word >= lower && word <= upper) {
            flag = true;
        }
        return flag;
    }
}