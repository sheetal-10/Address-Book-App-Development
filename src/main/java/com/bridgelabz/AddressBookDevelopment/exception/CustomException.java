package com.bridgelabz.AddressBookDevelopment.exception;

/**
 * Layer that handles custom exception
 * @author - Sheetal Panda
 * @version - 0.0.1
 * @since - 14/10/2021
 */
public class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}
