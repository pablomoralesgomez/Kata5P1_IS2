/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Pablo
 */
public class Person {
    
    private String first_name;
    private String last_name;
    private String company_name;
    private String address;
    private String city;
    private String county;
    private String state;
    private int zip;
    private String phone1;
    private String phone2;
    private String email;
    private String web;

    public Person(String first_name, String last_name, String company_name, 
                  String address, String city, String county, String state, 
                  int zip, String phone1, String phone2, String email, 
                  String web) {
        
        this.first_name = first_name;
        this.last_name = last_name;
        this.company_name = company_name;
        this.address = address;
        this.city = city;
        this.county = county;
        this.state = state;
        this.zip = zip;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.email = email;
        this.web = web;
    }
    
    @Override
    public String toString() {
        return first_name + " " + last_name + " | " + company_name 
                + " | " + address + " | " + city + " | " + county + " | " 
                + state + " | " + zip + " | " + phone1 + "/" + phone2 
                + " | " + email + " | " + web;
    }
}
