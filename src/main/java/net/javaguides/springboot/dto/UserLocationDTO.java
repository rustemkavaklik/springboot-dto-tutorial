package net.javaguides.springboot.dto;


import lombok.Data;

@Data

public class UserLocationDTO {
    private long userId;      //from User
    private String email;       //from User
    private String place;       //from Location
    private double longitude;   //from Location
    private double latitude;    //from Location


}
