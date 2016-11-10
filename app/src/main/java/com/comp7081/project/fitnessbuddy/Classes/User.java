package com.comp7081.project.fitnessbuddy.Classes;

import com.orm.SugarRecord;

/**
 * Created by danny on 2016-11-10.
 */

public class User extends SugarRecord {
    String fullname;
    String username;
    int password;

    public User() {}

    public User(String fName, String uName, String pwd) {
        this.fullname = fName;
        this.username = uName;
        this.password = pwd.hashCode();
    }

    public boolean checkPassword(String pwd) {
        return (pwd.hashCode() == this.password);
    }
}
