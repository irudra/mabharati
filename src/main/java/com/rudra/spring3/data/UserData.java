package com.rudra.spring3.data;


public class UserData {

    private String id;

    private String firstName;
    private String lastName;

    public UserData() {}

    public UserData(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

}