package com.geekster.userManagement.BeanFactory;

import com.geekster.userManagement.Model.Type;
import com.geekster.userManagement.Model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanMaker {

    @Bean
    public List<User> getUsers(){

        return new ArrayList<>();
    }
}
