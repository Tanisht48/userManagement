package com.geekster.userManagement.Controller;

import com.geekster.userManagement.Model.User;
import com.geekster.userManagement.Services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class UserController {
    @Autowired
    UserService userService;

    //post or adduser or users
    @PostMapping("user")    //addUser
    public String addUser(@Valid @RequestBody User u)
    {
        return userService.inputUser(u);
    }
    @PostMapping("users")
    public String addUsers(@RequestBody @Valid List<User>u)
    {
        return userService.inputUsers(u);
    }



    @GetMapping("users")  //getAllUser
    public List<User> getAllUsers()
    {
        return userService.getAllUser();
    }

    @GetMapping("user/{iD}") //getUser/{userid}

    public User getUserById(@PathVariable Integer iD)
    {
        return userService.getUser(iD);
    }


    //	updateUserInfo Phone and Address
    @PutMapping("user/{iD}/number/{num}")
    public String updateUserNumById(@PathVariable Integer iD,@PathVariable String num)
    {
        return userService.updateUserNumber(iD,num);
    }

    @PutMapping("user/{iD}/address/{address}")
    public String updateUserAddressById(@PathVariable Integer iD,@PathVariable String email)
    {
        return userService.updateUserEmailAddress(iD,email);
    }



    //deleteUser
    @DeleteMapping("user/{iD}")
    public String deleteUserById(@PathVariable Integer iD)
    {
        return userService.deleteUser(iD);
    }

}


