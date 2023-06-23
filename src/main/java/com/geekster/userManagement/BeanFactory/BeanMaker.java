package com.geekster.userManagement.BeanFactory;

import com.geekster.userManagement.Model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanMaker {

    @Bean
    public List<User> getUsers(){

        User initUser = new User(0,"Tanisht Gupta","Tanisht48","WB District:Darjeeling","9002345345");
        List<User> initList = new ArrayList<>();
        initList.add(initUser);


        return initList;
    }
}
