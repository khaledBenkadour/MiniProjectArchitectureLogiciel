package com.photoappusers.photo.app.users.ui.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateUserRequestModel {

    @NotNull(message = "First name cannot be null")
    @Size(min =2 , message = "First name must be less than two characters" )
    private String firstName;
    @NotNull(message = "Last name cannot be null")
    @Size(min =2 , message = "Last name must be less than two characters" )
    private String lastName;
    @NotNull(message = "password cannot be null")
    @Size(min = 8, max = 16, message = "Password must be equal or grater than 8 characters and less than 16 characters")
    private String password;
    @NotNull(message = "password cannot be null")
    @Email
    private String email;

    public CreateUserRequestModel() { }

    public CreateUserRequestModel(String lastName, String password, String email) {
        this.lastName = lastName;
        this.password = password;
        this.email = email;
    }


    public String getFirstName() {
        return firstName;
    }

    public CreateUserRequestModel setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public CreateUserRequestModel setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public CreateUserRequestModel setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public CreateUserRequestModel setEmail(String email) {
        this.email = email;
        return this;
    }
}
