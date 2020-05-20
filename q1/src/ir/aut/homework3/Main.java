package ir.aut.homework3;

import ir.aut.homework3.q1.*;
import ir.aut.homework3.q2.*;
import ir.aut.homework3.q4.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        int choice;
        System.out.println("please select a homework to check out:");
        Scanner choose = new Scanner(System.in);
        choice = choose.nextInt();
        switch (choice) {
            case 1:
                q1();
                faultAndContinue(choose);
                break;
            case 2:
                q2();
                faultAndContinue(choose);
                break;
            case 4:
                q4();
                faultAndContinue(choose);
                break;
            default:
                System.out.println("wrong choice!\nenter a number again:\n");
                menu();
                break;
        }
    }

    private static void faultAndContinue(Scanner choose) {
        System.out.println("do you want to choose another homework? (Y/N)");
        char choice2 = choose.next(".").charAt(0);
        if (choice2 == 'Y')
            menu();
        else if (choice2 == 'N') ;
        else {
            System.out.println("wrong choice!\nenter again:");
            faultAndContinue(choose);
        }
    }

    private static void q1() {
        ComplexNumberExtension complex = new ComplexNumberExtension();
        ComplexNumberExtension complex1 = new ComplexNumberExtension(2, 3);
        ComplexNumberExtension complex2 = new ComplexNumberExtension(1, 4);
        ComplexNumberExtension complex3 = new ComplexNumberExtension(-2, 0);
        ComplexNumberExtension complex4 = new ComplexNumberExtension(5, -3);
        ComplexNumberExtension complex5 = new ComplexNumberExtension(2, 3);
        complex.addToArray(complex1);
        complex.addToArray(complex2);
        complex.addToArray(complex3);
        complex.addToArray(complex4);
        complex.addToArray(complex5);
        complex.addToList(complex1);
        complex.addToList(complex2);
        complex.addToList(complex3);
        complex.addToList(complex4);
        complex.addToList(complex5);
        System.out.println("contacts array with for-loop:");
        complex.showArrayWithLoop();
        System.out.println();
        System.out.println("contacts array with for-each:");
        complex.showArrayWithEach();
        System.out.println();
        System.out.println("contacts array when index 3 (" + complex.toString(complex3) + ") have been removed:");
        complex.removeByArrayIndex(3);
        complex.showArrayWithLoop();
        System.out.println();
        System.out.println("contacts array when object 3 (" + complex.toString(complex4) + ") have been removed:");
        complex.removeByArrayObject(complex4);
        complex.showArrayWithEach();
        System.out.println();
        System.out.println("contacts list with iterator:");
        complex.showListWithIterator();
        System.out.println();
        System.out.println("contacts list with for-loop:");
        complex.showListWithLoop();
        System.out.println();
        System.out.println("contacts list with for-each:");
        complex.showListWithEach();
        System.out.println();
        System.out.println("contacts list when index 3 (" + complex.toString(complex3) + ") have been removed:");
        complex.removeByListIndex(3);
        complex.showListWithIterator();
        System.out.println();
        System.out.println("contacts list when object 3 (" + complex.toString(complex4) + ") have been removed:");
        complex.removeByListObject(complex4);
        complex.showListWithIterator();
        System.out.println();
        System.out.println("when you search object 1 (" + complex.toString(complex1) + ") in list:");
        System.out.println("the index is: " + complex.searchInList(complex1));
        System.out.println();
        System.out.println("when you search object 4 (" + complex.toString(complex4) + ") in list:");
        System.out.println("the index is: " + complex.searchInList(complex4));
        System.out.println();
        System.out.println("when you search object 2 (" + complex.toString(complex2) + ") in array:");
        System.out.println("the index is: " + complex.searchInArray(complex2));
        System.out.println();
        System.out.println("when you search object 4 (" + complex.toString(complex4) + ") in array:");
        System.out.println("the index is: " + complex.searchInArray(complex4));
    }

    private static void q2() {
        AddressBook book = new AddressBook();
        Contact contact1 = new Contact("0911111111", 1392, "Tehran- Iran");
        Contact contact2 = new Contact("0922222222", 1378, "Shiraz- Iran");
        Contact contact3 = new Contact("0933333333", 1377, "Tehran- Iran");
        Contact contact4 = new Contact("0944444444", "Mashhad- Iran");
        Contact contact5 = new Contact("0955555555", 1358);
        Contact contact = new Contact("0966666666", 1396, "Kerman- Iran");
        book.addContact(contact1);
        book.addContact(contact2);
        book.addContact(contact3);
        book.addContact(contact4);
        book.addContact(contact5);
        System.out.println("these are the contacts:");
        book.showContact();
        System.out.println();
        System.out.println("contact 4 has been removed:");
        book.removeContact(contact4);
        book.showContact();
        System.out.println();
        System.out.println("contact 2 has been edited:");
        book.editContact(contact2, contact);
        book.showContact();
        System.out.println();
        System.out.println("this is the size of contact list now:");
        System.out.println(book.sizeOfContact());
    }

    private static void q4() {
        Student student = new Student("Parsa", 9531908, 95);
        GraduateStudent student1 = new GraduateStudent("Eisa", 9531072, 95, "Pour Vatan");
        UndergraduateStudent student2 = new UndergraduateStudent("Soroush", 9531904, 95, UndergraduateStudent.type.FACULTY);
        Student student3 = new Student("Kimia", 9531906);
        System.out.println(student.displayInfo());
        System.out.println(student1.displayStudentInformation());
        System.out.println(student2.displayStudentInformation());
        System.out.println(student3.displayInfo());
        student1.setStudentNumber(1111111);
        System.out.println("\nit is possible to change student number with setter; for example:");
        System.out.println(student1.displayInfo());
    }
}
