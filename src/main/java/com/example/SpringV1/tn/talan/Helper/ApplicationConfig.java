package com.example.SpringV1.tn.talan.Helper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper(); //bean method creates a ModelMapper instance and returns it.
        return modelMapper;
    }
}
