# <h1 align = "center"> User Management </h1>
___ 
<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.0.6-brightgreen.svg" />
</a>
</p>

---

<p align="left">

## Dependencies
    SpringBoot Starter Web
    Lombok
    Validation

## Data Flow
  ### User
      1.userId 
      2.userName  
      3.Type 
      4.userEmail @Email
      5.userContactNo 
      6.userDOB
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
</p>

## Data Structure
  ArrayList from the collection framework

## Project Summary
  In this application we can  Create Read Update Delete a user from the different api that are in this application
