package com.bridgelabz.AddressBookDevelopment.service;

import com.bridgelabz.AddressBookDevelopment.dto.AddressBookDto;
import com.bridgelabz.AddressBookDevelopment.entity.AddressBook;
import com.bridgelabz.AddressBookDevelopment.exception.CustomException;
import com.bridgelabz.AddressBookDevelopment.repository.AddressBookRepository;
import org.modelmapper.ModelMapper;
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

    @Autowired
    private ModelMapper modelMapper;

    /**
     * Function to get list of addresses from database
     * @return list of addresses
     */
    public List<AddressBook> addresses() {
        return addressBookRepository.findAll();
    }

    /**
     * Function to get a particular address stored in database
     * @param id unique id of the person whose address stored
     * @return address with unique id
     */
    public AddressBook getAddressById(int id) {
        Optional<AddressBook> optionalAddressBook = addressBookRepository.findById(id);
        if (optionalAddressBook.isPresent()) {
            return optionalAddressBook.get();
        }
        return null;
    }

    /**
     * Function to add address to the database
     * @param addressBookDto address data from client
     * @return added address
     */
    public AddressBook addAddress(AddressBookDto addressBookDto) {
        AddressBook addressBook = new AddressBook();
        modelMapper.map(addressBookDto, addressBook);
        return addressBookRepository.save(addressBook);
    }

    /**
     * Function to edit the available address in the database
     * @param id of the id whose address stored
     * @param addressBookDto data from client
     * @return updated address of the person
     */
    public AddressBook updateAddressBook(int id, AddressBookDto addressBookDto) {
        Optional<AddressBook> optionalAddressBook = addressBookRepository.findById(id);
        if (optionalAddressBook.isPresent()) {
            AddressBook addressBook = optionalAddressBook.get();
            modelMapper.map(addressBookDto, addressBook);
            return addressBookRepository.save(addressBook);
        }
        return null;
    }

    /**
     * Function to particular address from database and delete it
     * @param id of the person whose address stored
     * @return String message displaying status of operation
     */
    public String deleteAddress(int id) {
        Optional<AddressBook> optionalAddressBook = addressBookRepository.findById(id);
        if (optionalAddressBook.isPresent()) {
            addressBookRepository.delete(optionalAddressBook.get());
            return "Record deleted successfully";
        }
        throw new CustomException("Record does not exists with this id : " + id);
       // return "Record does not exists with this id : " + id;
    }

}
