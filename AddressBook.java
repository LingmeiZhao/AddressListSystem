/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbookapp;

import java.util.ArrayList;

import static java.lang.System.out;

import java.io.*;

/**
 *
 * @author juliazhao
 */
public class AddressBook {

    public ArrayList<Person> people;

    public AddressBook() {
        this.people = new ArrayList<Person>();
    }

    public int count() {
        return people.size();
    }

    public void add(Person p) {
        people.add(p);
    }

    public void printEntries() {
        for (Person p : people) {
            out.println(p.firstName + " " + p.lastName);
        }

    }

    public static ArrayList<String> readLines(String fileName)
            throws IOException {

        ArrayList<String> result = new ArrayList<String>();
        File file = new File(fileName);
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);

        String line = reader.readLine();
        while (line != null) {
            result.add(line);
            line = reader.readLine();
        }
        return result;
    }

    public void loadData(String fileName) {
        try {
            ArrayList<String> lines = readLines(fileName);
            ArrayList<Person> newPeople = new ArrayList<Person>();
            for (int i = 1; i < lines.size(); i++) {
                String line = lines.get(i);
                String[] array = line.split("\\|");
                if (array.length != 12) {
                    out.println("error data: line " + i);
                    return;
                } else {
                    Person p = new Person(
                            array[0], array[1], array[2],
                            array[3], array[4], array[5],
                            array[6], Integer.parseInt(array[7]),
                            Long.parseLong(array[8].replace("-", "")),
                            Long.parseLong(array[9].replace("-", "")),
                            array[10], array[11]
                    );
                    newPeople.add(p);
                }
            }
            for (Person p : newPeople) {
                people.add(p);
            }
        } catch (IOException e) {
            out.println(e.getMessage());
        }

    }
    // TODO co

}
