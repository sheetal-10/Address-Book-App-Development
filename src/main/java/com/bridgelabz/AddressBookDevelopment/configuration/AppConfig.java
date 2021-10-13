package com.bridgelabz.AddressBookDevelopment.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Layer that maps Java Beans from one presentation to other
 * @author - Sheetal Panda
 * @version - 0.0.1
 * @since - 13/10/2021
 */

@Configuration
public class AppConfig {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
