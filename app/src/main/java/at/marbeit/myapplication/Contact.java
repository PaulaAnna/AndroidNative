package at.marbeit.myapplication;

import java.util.ArrayList;

public class Contact {
    private String mName;

    public Contact(String name) {
        mName = name;
    }

    public static ArrayList<Contact> createContactsList(int numContacts) {
        ArrayList<Contact> contacts = new ArrayList<>();
        int lastContactId = 0;
        for (int i = 1; i <= numContacts; i++) {
            contacts.add(new Contact("Person " + ++lastContactId));
        }
        return contacts;
    }

    public String getName() {
        return mName;
    }
}
