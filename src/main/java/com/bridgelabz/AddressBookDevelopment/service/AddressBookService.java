package com.bridgelabz.AddressBookDevelopment.service;

import com.bridgelabz.AddressBookDevelopment.dto.AddressBookDto;
import com.bridgelabz.AddressBookDevelopment.entity.AddressBook;
import com.bridgelabz.AddressBookDevelopment.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * This layer contains business logic
 * It implements all the methods in controller layer
 * @author - Sheetal Panda
 * @version - 0.0.1
 * @since - 13/10/2021
 */
@Service
public class AddressBookService {

    @Autowired
    private AddressBookRepository addressBookRepository;

    public AddressBook updateAddress(int id, AddressBookDto addressBookDto) {
        return null;
    }

    public String deleteAddress(int id) {
        return null;
    }

    public AddressBook addAddress(AddressBookDto addressBookDto) {
        return null;
    }

    public List<AddressBook> addresses() {
        return null;
    }

    public AddressBook getAddressById(int id) {
        return null;
    }
}
