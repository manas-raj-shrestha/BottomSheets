package com.droid.manasshrestha.bottomsheets;

import java.util.ArrayList;

/**
 * provides static data for listing
 */
public class DataProvider {

    private static final ArrayList<Contacts> contacts = new ArrayList<>();

    public static ArrayList<Contacts> getContacts() {
        contacts.add(new Contacts("Evas", "+9779676123432", "evas@gmail.com"));
        contacts.add(new Contacts("Stan", "+9779476123433", "stan@gmail.com"));
        contacts.add(new Contacts("Mark", "+9779376123431", "mark@gmail.com"));
        contacts.add(new Contacts("Julie", "+9778876123442", "julie@gmail.com"));
        contacts.add(new Contacts("James", "+9777876123452", "james@gmail.com"));
        contacts.add(new Contacts("Chang", "+9776876123632", "changs@gmail.com"));
        contacts.add(new Contacts("Roy", "+9779836127432", "roy@gmail.com"));
        contacts.add(new Contacts("Lizel", "+9770876523432", "lizel@gmail.com"));
        contacts.add(new Contacts("Zoe", "+9779896126432", "zoe@gmail.com"));
        contacts.add(new Contacts("Alan", "+9779876183432", "alan@gmail.com"));
        contacts.add(new Contacts("Nick", "+9779776129432", "nick@gmail.com"));
        contacts.add(new Contacts("Ted", "+9779866193432", "ted@gmail.com"));

        return contacts;
    }
}
