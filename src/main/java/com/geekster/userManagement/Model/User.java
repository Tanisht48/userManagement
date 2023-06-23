package com.geekster.userManagement.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer userId;

    private String userName;

    private String userHandle;

    private String userAddress;

    private  String userContactNo;
}
/*
    UserId
	Name
	UserName
	Address
	Phone Number
	*/