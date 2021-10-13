package com.bridgelabz.AddressBookDevelopment.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Layer that contains entities in database
 * @author - Sheetal Panda
 * @version - 0.0.1
 * @since - 13/10/2021
 */
@Data
@Entity
public class AddressBook {
    @Id
    private int id;
    private String name;
    private String address;
    private String state;
}
