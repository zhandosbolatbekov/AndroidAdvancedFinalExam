package com.example.zhandos.contactlist;

import java.io.Serializable;

/**
 * Created by zhandos on 12/11/18.
 */

public class ContactGroup implements Serializable {
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

    public float getPriority() {
        return priority;
    }

    public void setPriority(float priority) {
        this.priority = priority;
    }

    private String id;
    private String name;
    private float priority;

    public ContactGroup(String id, String name, float priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }
}
