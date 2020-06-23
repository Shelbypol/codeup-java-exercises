package contactsManager;

import utils.Input;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContactApplication {

    static Input input = new Input();

    public static void main(String[] args) throws IOException {

        //DO-WHILE CONDITION
        boolean keepLooking = true;

        do {
            //PATCH TO CONTACTS
            Path contacts = Paths.get("src/contactsManager", "contacts.txt");
            //READ CONTACTS
            List<String> contactList = Files.readAllLines(contacts);

            System.out.println("\n------------------ MENU -----------------------");
            System.out.println("1. View contacts." +
                    "\n2. Add a new contact." +
                    "\n3. Search a contact by name." +
                    "\n4. Delete an existing contact." +
                    "\n5. Exit." +
                    "\nEnter an option(1, 2, 3, 4 or 5");
            System.out.println("-----------------------------------------------");

            int userChoice = input.getInt(1, 5);

            switch (userChoice) {
                case 1:
                    //VIEW CONTACTS
                    System.out.println("=============== ALL CONTACTS ==================");
                    for (String contact : contactList) {
                        System.out.println(contact);
                    }
                    keepLooking = true;
                    break;
                case 2:
                    //ADD NEW CONTACT
                    System.out.println("Please enter contacts first name below.");
                    String userInputFirstName = input.getString();
                    System.out.println("Please enter contacts last name below.");
                    String userInputLastName = input.getString();
                    System.out.println("Please enter contacts number below.");
                    String userInputNumber = input.getString();
                    Files.write(
                            contacts,
                            Arrays.asList(userInputFirstName + " " + userInputLastName + " " + userInputNumber),
                            StandardOpenOption.APPEND
                    );
                    keepLooking = true;
                    break;
                case 3:
                    //SEARCH BY NAMe

                    System.out.println("Enter contact name");
                    String userSearchContactName = input.getString();
//                    List<String> searchList = Files.readAllLines(contacts);


                    String[] testArray;
                    for (String contact : contactList) {
                        testArray = contact.split(",");

                        for (int i = 0; i < testArray.length - 1; i++) {
                            if (testArray[i].contains(userSearchContactName)) {
                                System.out.println(testArray[0] + testArray[1] + testArray[2]);
                            }
                        }
                    }


                    keepLooking = true;
                    break;
                case 4:

                    keepLooking = true;
                    break;
                case 5:
                    System.out.println("While contacts may be great glasses are better! Bye!");
                    keepLooking = false;
                    break;
            }

        } while (keepLooking);


    }
}
