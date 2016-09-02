package com.droid.manasshrestha.bottomsheets;

import java.util.ArrayList;

/**
 * provides static data for listing
 */
public class DataProvider {

    private static final ArrayList<Contact> contacts = new ArrayList<>();

    public static ArrayList<Contact> getContacts() {
        contacts.add(new Contact("Evas Perkins", "+9779676123432", "evas@gmail.com", "http://blog.mindupdate.org/images/male-hairstyles-short-straight-i9.jpg"));
        contacts.add(new Contact("Stan Hansen", "+9779476123433", "stan@gmail.com", "http://puroresucentral.com/Images/hansenmain.jpg"));
        contacts.add(new Contact("Mark Watson", "+9779376123431", "mark@gmail.com", "https://www.tena.com.au/globalassets/man.png"));
        contacts.add(new Contact("Julie Hendrix", "+9778876123442", "julie@gmail.com", "https://v.cdn.vine.co/v/avatars/61A1A6D4-2D48-435F-A814-E9EAED33C3D3-971-0000010244B8EA17.jpg?versionId=vc2GcD.rMGXF_NU_uxkbU_RZjECmUpWC"));
        contacts.add(new Contact("James Roberts", "+9777876123452", "james@gmail.com", "https://pbs.twimg.com/profile_images/458483874071191552/wwgNWH0j.jpeg"));
        contacts.add(new Contact("Chang Jonson", "+9776876123632", "changs@gmail.com", "http://www.chinadaily.com.cn/celebrity/img/attachement/jpg/site1/20131211/001ec97909631412122b07.jpg"));
        contacts.add(new Contact("Roy Bane", "+9779836127432", "roy@gmail.com", "http://cdn.globaltelecomsbusiness.com/images/759/phil_male_sq.gif"));
        contacts.add(new Contact("Libel Chan", "+9770876523432", "libel@gmail.com", "https://www.asme.org/getmedia/83937fe3-ff3e-450f-a469-33c948c2a623/Fostering-Future-Female-Engineers_01.jpg.aspx?width=340"));
        contacts.add(new Contact("Zoe Aldrin", "+9779896126432", "zoe@gmail.com", "http://www.virtualffs.co.uk/my%20FFS%20thesis%20images/Female%20Androgyne%202.jpg"));
        contacts.add(new Contact("Alan Mosley", "+9779876183432", "alan@gmail.com", "http://www.coremedicalgrp.com/images/low-test-aka-male-menopause.jpeg"));
        contacts.add(new Contact("Nick Harper", "+9779776129432", "nick@gmail.com", "http://www.harperspace.com/assets/nick-harper-press-photo-08m.jpg"));
        contacts.add(new Contact("Ted Bennett", "+9779866193432", "ted@gmail.com", "http://cdn.breitbart.com/mediaserver/Breitbart/Big-Hollywood/2013/02/11/bennett/Bennett.jpg"));

        return contacts;
    }

}
