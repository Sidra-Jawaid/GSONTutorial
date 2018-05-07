package com.example.sidrajawaid.demogson;

import com.google.gson.annotations.SerializedName;

public class NewClass {
    @SerializedName("name")
    private String mName;
    @SerializedName("age")
    private int mAge;
    @SerializedName("email")
    private String mEmail;

    public NewClass(String name, int age, String email) {
       mName = name;
        mAge = age;
        mEmail = email;
    }
}
