# User Management
___
## FrameWork and Language
    Framework:SpringBoot
    Language : Java
## Dependencies
    SpringBoot Starter Web
    Lombok
    Validation

## Data Flow
  ### User
      1.userId @Not null
      2.userName  @NotBlank @Pattern(regexp = "^[a-zA-Z ]+$")
      3.Type 
      4.userEmail @Email
      5.userContactNo  @Size(min = 12,max = 12) @Pattern( regexp = "91[0-9]+",message = "Enter a Valid Phone Number")
      6.userDOB  @Pattern( regexp = "^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-(\\d{4})$")
  ### Controller
       1. @PostMapping("user")
       2. @PostMapping("users")
       3. @GetMapping("users")
       4. @GetMapping("user/{id}")
       5. @PutMapping("user/{iD}/number/{num}")
       6. @PutMapping("user/{iD}/address/{address}")
       7. @DeleteMapping("user/{iD}")
  ### Service
       1. Get all user
       2. Get a specific user
       3. add user
       4. add users
       5. update user contact info
       6. delete user
## Data Structure
  ArrayList from the collection framework

## Project Summary
  In this application we can  Create Read Update Delete a user from the different api that are in this application
