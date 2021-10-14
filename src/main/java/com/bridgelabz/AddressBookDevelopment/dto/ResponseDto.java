package com.bridgelabz.AddressBookDevelopment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Layer that carries all the data
 * @author - Sheetal Panda
 * @version - 0.0.1
 * @since - 14/10/2021
 */
@Data
@AllArgsConstructor
public class ResponseDto {
    private String message;
    private Object data;
}
