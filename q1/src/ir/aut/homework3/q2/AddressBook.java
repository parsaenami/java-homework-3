package ir.aut.homework3.q2;

import java.util.HashMap;

public class AddressBook {
    private HashMap<String, Contact> ContactList = new HashMap<>();

    /**
     * default constructor
     */
    public AddressBook() {
    }

    /**
     * this method adds a contact to hash map
     *
     * @param contact is the contact that is going to be added
     */
    public void addContact(Contact contact) {
        ContactList.put(contact.getNumber(), contact);
    }

    /**
     * this method removes a contact from hash map
     *
     * @param contact is the removal contact
     */
    public void removeContact(Contact contact) {
        ContactList.remove(contact.getNumber());
    }

    /**
     * this method edits a contact
     *
     * @param contact  previous contact
     * @param contact1 new contact(with new information)
     */
    public void editContact(Contact contact, Contact contact1) {
        ContactList.remove(contact.getNumber());
        ContactList.put(contact1.getNumber(), contact1);
    }

    /**
     * this method prints the contact list
     */
    public void showContact() {
        int i = 1;
        for (Contact contact : ContactList.values()) {
            System.out.println("(" + i + ")" + contact);
            i++;
        }
    }

    /**
     * this method gives the number of contacts
     *
     * @return the number if contacts
     */
    public int sizeOfContact() {
        return ContactList.size();
    }

    public HashMap<String, Contact> getContactList() {
        return ContactList;
    }

    public void setContactList(HashMap<String, Contact> contactList) {
        ContactList = contactList;
    }
}