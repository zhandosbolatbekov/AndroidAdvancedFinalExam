package com.example.zhandos.contactlist;

import java.io.Serializable;

/**
 * Created by zhandos on 12/11/18.
 */

public class Contact implements Serializable {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    public String getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    public void setWorkPhoneNumber(String workPhoneNumber) {
        this.workPhoneNumber = workPhoneNumber;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getContactGroupId() {
        return contactGroupId;
    }

    public void setContactGroupId(String contactGroupId) {
        this.contactGroupId = contactGroupId;
    }

    private String id;
    private String name;
    private String mobilePhoneNumber;
    private String homePhoneNumber;
    private String workPhoneNumber;
    private String avatarUrl;
    private String contactGroupId;

    public Contact(String id,
                   String name,
                   String mobilePhoneNumber,
                   String homePhoneNumber,
                   String workPhoneNumber,
                   String avatarUrl,
                   String contactGroupId) {
        this.id = id;
        this.name = name;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.homePhoneNumber = homePhoneNumber;
        this.workPhoneNumber = workPhoneNumber;
        this.avatarUrl = avatarUrl;
        this.contactGroupId = contactGroupId;
    }

    @Override
    public String toString() {
        return String.format("Contact{id='%s', name='%s'}", id, name);
    }
}
