package ir.aut.homework3.q2;

public class Contact {
    private String number;
    private int birthYear;
    private String address;

    /**
     * a constructor to make a contact with 3 arguments
     *
     * @param number    is the contact'sphone number
     * @param birthYear is the contact's birth year
     * @param address   is the contact's address
     */
    public Contact(String number, int birthYear, String address) {
        this.address = address;
        this.birthYear = birthYear;
        this.number = number;
    }

    /**
     * a constructor to make a contact with 2 arguments
     *
     * @param number    is the contact'sphone number
     * @param birthYear is the contact's birth year
     */
    public Contact(String number, int birthYear) {
        this.number = number;
        this.birthYear = birthYear;
        this.address = "?";
    }

    /**
     * default constructor
     */
    public Contact() {
        this("?", 0, "?");
    }

    /**
     * a constructor to make a contact with 2 arguments
     *
     * @param number  is the contact'sphone number
     * @param address is the contact's address
     */
    public Contact(String number, String address) {
        this.number = number;
        this.address = address;
        this.birthYear = 0;
    }

    /**
     * this method converts a contact to string
     *
     * @return converted string of a contact
     */
    public String toString() {
        return this.getNumber() + "\t\t" + this.getBirthYear() + "\t\t" + this.getAddress();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
