package com.droid.manasshrestha.bottomsheets;

/**
 * Contact model
 */
public class Contacts {

    private String contactName;
    private String contactMobileNumber;
    private String contactEmailAddress;

    public Contacts(String contactName, String contactMobileNumber, String contactEmailAddress){
        this.contactName = contactName;
        this.contactMobileNumber = contactMobileNumber;
        this.contactEmailAddress = contactEmailAddress;
    }

    public String getContactEmailAddress() {
        return contactEmailAddress;
    }

    public void setContactEmailAddress(String contactEmailAddress) {
        this.contactEmailAddress = contactEmailAddress;
    }

    public String getContactMobileNumber() {
        return contactMobileNumber;
    }

    public void setContactMobileNumber(String contactMobileNumber) {
        this.contactMobileNumber = contactMobileNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
}
