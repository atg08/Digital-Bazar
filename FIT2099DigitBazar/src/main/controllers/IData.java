package main.controllers;


/**
 * creating an interface IData to check if the device is available
 * @author Aditti Gupta
 * @version 1.0.0
 * @see Store
 * @see PurchaseManager
 */

public interface IData {
    boolean isDeviceAvailable(int id);
}
