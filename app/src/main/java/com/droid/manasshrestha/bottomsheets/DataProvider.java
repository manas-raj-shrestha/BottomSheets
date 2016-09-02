package com.droid.manasshrestha.bottomsheets;

import java.util.ArrayList;

/**
 * provides static data for listing
 */
public class DataProvider {

    private static final ArrayList<Contact> CONTACTs = new ArrayList<>();

    public static ArrayList<Contact> getCONTACTs() {
        CONTACTs.add(new Contact("Evas Perkins", "+9779676123432", "evas@gmail.com"));
        CONTACTs.add(new Contact("Stan Hansen", "+9779476123433", "stan@gmail.com"));
        CONTACTs.add(new Contact("Mark Watson", "+9779376123431", "mark@gmail.com"));
        CONTACTs.add(new Contact("Julie Hendrix", "+9778876123442", "julie@gmail.com"));
        CONTACTs.add(new Contact("James Roberts", "+9777876123452", "james@gmail.com"));
        CONTACTs.add(new Contact("Chang Jonson", "+9776876123632", "changs@gmail.com"));
        CONTACTs.add(new Contact("Roy Bane", "+9779836127432", "roy@gmail.com"));
        CONTACTs.add(new Contact("Libel Chan", "+9770876523432", "libel@gmail.com"));
        CONTACTs.add(new Contact("Zoe Aldrin", "+9779896126432", "zoe@gmail.com"));
        CONTACTs.add(new Contact("Alan Mosley", "+9779876183432", "alan@gmail.com"));
        CONTACTs.add(new Contact("Nick Harper", "+9779776129432", "nick@gmail.com"));
        CONTACTs.add(new Contact("Ted Bennett", "+9779866193432", "ted@gmail.com"));

        return CONTACTs;
    }
}
