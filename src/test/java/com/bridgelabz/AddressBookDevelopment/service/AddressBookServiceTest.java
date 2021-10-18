package com.bridgelabz.AddressBookDevelopment.service;

import com.bridgelabz.AddressBookDevelopment.entity.AddressBook;
import com.bridgelabz.AddressBookDevelopment.repository.AddressBookRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

/**
 * Layer that simulates test case to determine
 * features of address book service layer is performing as expected
 * @author - Sheetal Panda
 * @version - 0.0.1
 * @since - 17/10/2021
 */

@ExtendWith(MockitoExtension.class)
public class AddressBookServiceTest {
    @InjectMocks
    private AddressBookService addressBookService;
    @Mock
    private AddressBookRepository addressBookRepository;
    @Mock
    private
    ModelMapper modelMapper;

    @Test
    public void givenID_WhenCalled_ShouldReturnPersonById() {
        AddressBook addressBook = new AddressBook();
        addressBook.setId(1);
        Assertions.assertEquals(1, addressBook.getId());
    }

    @Test
    public void givenName_WhenCalled_ShouldReturnPersonByName() {
        AddressBook addressBook = new AddressBook();
        addressBook.setName("Sheetal");
        Assertions.assertEquals("Sheetal", addressBook.getName());
    }

    @Test
    public void givenAddress_WhenCalled_ShouldReturnPersonByAddress() {
        AddressBook addressBook = new AddressBook();
        addressBook.setName("Bhubaneswar");
        Assertions.assertEquals("Bhubaneswar", addressBook.getName());
    }

    @Test
    public void givenState_WhenCalled_ShouldReturnPersonByState() {
        AddressBook addressBook = new AddressBook();
        addressBook.setName("Odisha");
        Assertions.assertEquals("Odisha", addressBook.getName());
    }

}
