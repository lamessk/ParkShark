package com.example.lames.parkshark;

public class User
{

    // information the user will enter
    public String email;
    public String name;
    public String address;
    public String licensePlate;
    public String password;

    // full constructor
    public User(String email, String name, String address, String licensePlate, String password)
    {
        this.email = email;
        this.name = name;
        this.address = address;
        this.licensePlate = licensePlate;
        this.password = password;
    }
}
