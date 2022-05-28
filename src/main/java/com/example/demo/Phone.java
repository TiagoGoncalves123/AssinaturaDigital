package com.example.demo;

import javax.validation.constraints.NotBlank;

public class Phone {

    @NotBlank(message = "Phone Number is mandatory")
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Phone{" + "phoneNumber=" + phoneNumber + '}';
    }

    /* public void validateNumber(int phoneNumber){
        if(phoneNumber == 99){
            System.out.println("O telemovel está correto");
        } else{
            System.out.println("O telemovel nao está correto");
        }
    }
     */
}
