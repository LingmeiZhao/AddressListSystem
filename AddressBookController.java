/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbookapp;

import static java.lang.System.out;
import java.io.*;
import java.util.*;

/**
 *
 * @author juliazhao
 */
public class AddressBookController {

    private AddressBook model;
    private AddressBookView view;

    AddressBookController(AddressBook model, AddressBookView view) {
        this.model = model;
        this.view = view;
    }

    public static String readLine() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    public void addPerson() {

        try {
            out.println("FirstName: ");
            String firstName = readLine();
            out.println("LastName: ");
            String lastName = readLine();
            out.println("CompanyName: ");
            String companyName = readLine();
            out.println("Address: ");
            String address = readLine();
            out.println("City: ");
            String city = readLine();
            out.println(" Country: ");
            String country = readLine();
            out.println("State: ");
            String state = readLine();
            out.println("Zip: ");
            int zip = Integer.parseInt(readLine());
            out.println("Phone1: ");
            long phone1 = Long.parseLong(readLine());
            out.println("Phone2: ");
            long phone2 = Long.parseLong(readLine());
            out.println("Email: ");
            String email = readLine();
            out.println("Website: ");
            String website = readLine();
            Person p = new Person(
                    firstName, lastName, companyName, address, city, country,
                    state, zip, phone1, phone2, email, website
            );
            model.add(p);
        } catch (IOException e) {
            out.println(e.getMessage());
        } catch (NumberFormatException e) {
            out.println(e.getMessage());
        }
    }

    public void getInformation() {
        try {
            out.println("Who do you want to find?");
            out.println("FirstName: ");
            String firstName = readLine();
            out.println("LastName: ");
            String lastName = readLine();
            ArrayList<Person> subset = new ArrayList<Person>();
            for (Person p : model.people) {
                if (firstName.equals(p.firstName) && lastName.equals(p.lastName)) {
                    Person person = new Person(p.firstName, p.lastName, p.companyName,
                            p.address, p.city, p.country,
                            p.state, p.zip, p.phone1, p.phone2, p.email, p.website);
                    subset.add(person);
                }
            }

            for (Person p : subset) {
                out.println(p.firstName + " | " + p.lastName + " | " + p.companyName + " | "
                        + p.address + " | " + p.city + " | " + p.country + " " + p.state + " | "
                        + p.zip + " | " + p.phone1 + " | " + p.phone2 + " | "
                        + p.email + " | " + p.website);
            }

        } catch (IOException e) {
            out.println(e.getMessage());
        } catch (NumberFormatException e) {
            out.println(e.getMessage());
        }

    }

}
