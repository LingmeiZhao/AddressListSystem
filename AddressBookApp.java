/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbookapp;

import java.io.*;

public class AddressBookApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String path = "/home/juliazhao/Documents/NetBeansProjects/AddressBookApp/us-address-book.csv";
        AddressBook addressBook = new AddressBook();
        addressBook.loadData(path);
        addressBook.printEntries();
        AddressBookView view = new AddressBookView();
        AddressBookController addressBookController = new AddressBookController(addressBook, view);
        //addressBookController.addPerson();
        //addressBook.printEntries();
        addressBookController.getInformation();

        // TODO code application logic here
    }

}
