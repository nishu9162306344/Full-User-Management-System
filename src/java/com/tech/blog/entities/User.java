/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tech.blog.entities;

/**
 *
 * @author Nishant Singh
 */
import java.sql.Timestamp;
import java.util.*;

public class User {
    
    private int id;
    private String name;
    private String email;
    private String password;
    private String gender;
    private String about;
    private Timestamp dateTime;
    private String Profile;
    
    
    //Parametrize constructor
    public User(int id, String name, String email, String gender, String password,String about, Timestamp dateTime) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.password = password;
        this.about=about;
        this.dateTime = dateTime;
    }
    //Default constructor
    public User(){
        
    }
    //Parametrize constructor without ID
    public User(String name, String email, String gender, String password,String about) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.password = password;
        this.about=about;
        
    }
    
    //Getter and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    public String getProfile() {
        return Profile;
    }

    public void setProfile(String Profile) {
        this.Profile = Profile;
    }
  
    
    
    
    
}
