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

        User initUser = new User(4869,"Tanisht Gupta",Type.ADMIN,
                "hells@gmail.com","919733316849","16-12-1998", LocalDate.now(), LocalTime.now());
        List<User> initList = new ArrayList<>();
        initList.add(initUser);


        return initList;
    }
}
