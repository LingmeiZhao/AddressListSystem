/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbookapp;

/**
 *
 * @author juliazhao
 */
public class Person {

    public String firstName;
    public String lastName;
    public String companyName;
    public String address;
    public String city;
    public String country;
    public String state;
    public int zip;
    public long phone1;
    public long phone2;
    public String email;
    public String website;

    public Person(String firstName,
            String lastName,
            String companyName,
            String address,
            String city,
            String country,
            String state,
            int zip,
            long phone1,
            long phone2,
            String email,
            String website) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.address = address;
        this.city = city;
        this.country = country;
        this.state = state;
        this.zip = zip;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.email = email;
        this.website = website;

    }

}
