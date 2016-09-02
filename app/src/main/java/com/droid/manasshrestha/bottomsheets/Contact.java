package com.droid.manasshrestha.bottomsheets;

/**
 * Contact model
 */
public class Contact {

    private String contactName;
    private String contactMobileNumber;
    private String contactEmailAddress;
    private String contactImageUrl;

    public Contact(String contactName, String contactMobileNumber, String contactEmailAddress, String contactPhotoUrl){
        this.contactName = contactName;
        this.contactMobileNumber = contactMobileNumber;
        this.contactEmailAddress = contactEmailAddress;
        this.contactImageUrl = contactPhotoUrl;
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

    public String getContactImageUrl() {
        return contactImageUrl;
    }

    public void setContactImageUrl(String contactImageUrl) {
        this.contactImageUrl = contactImageUrl;
    }
}
