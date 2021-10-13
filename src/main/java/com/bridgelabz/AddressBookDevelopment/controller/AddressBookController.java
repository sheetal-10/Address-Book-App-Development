package com.bridgelabz.AddressBookDevelopment.controller;

import com.bridgelabz.AddressBookDevelopment.dto.AddressBookDto;
import com.bridgelabz.AddressBookDevelopment.entity.AddressBook;
import com.bridgelabz.AddressBookDevelopment.service.AddressBookService;
import org.apache.tomcat.jni.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Layer that receives various HTTP requests from client
 * @author - Sheetal Panda
 * @version - 0.0.1
 * @since - 13/10/2021
 */
@RestController
public class AddressBookController {

    @Autowired
    private AddressBookService addressBookService;

    /**
     * Function to receive get request from client
     * @param fname
     * @param lname
     * @return greeting message
     */
    @GetMapping(value="greeting")
    public String greeting(@RequestParam String fname, @RequestParam String lname) {
        return "Hello : " + fname + " " + lname;
    }

    /**
     * Function to receive get request from client
     * @param addressBookDto address data from client
     * @return added address in the database
     */
    @PostMapping("/addAddress")
    public AddressBook addAddress(@RequestBody AddressBookDto addressBookDto){
        return addressBookService.addAddress(addressBookDto);
    }

    /**
     * Function to receive put request from client
     * @param id
     * @param addressBookDto
     * @return updated address
     */
    @PutMapping(value = "/updateAddress/{id}")
    public AddressBook updateAddress(@PathVariable int id, @RequestBody AddressBookDto addressBookDto){
        return addressBookService.updateAddress(id, addressBookDto);
    }

    /**
     * Function to receive delete request from client
     * @param id unique id of the person
     * @return String message displaying status of operation
     */
    @DeleteMapping(value = "/deleteAddress")
    public String deleteAddress(@RequestParam int id) {
        return addressBookService.deleteAddress(id);
    }

}
