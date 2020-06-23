package contactsManager;

import utils.Input;
import java.util.Arrays;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ContactApplication {

    static Input input = new Input();

//    public void caseOne(List<String> allContacts){
//        for (String contact :  allContacts) {
//            System.out.println(contact);
//        }
//    }

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
//                    for (String contact : contactList) {
//                    System.out.println(contact);
//                }
                    caseOne(contactList);
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
                    //SEARCH BY NAME
                    System.out.println("Enter contact name");
                    String userSearchContactName = input.getString();

                    String[] searchArray;
                    for (String contact : contactList) {
                        searchArray = contact.split(",");

                        for (int i = 0; i < searchArray.length - 1; i++) {
                            if (searchArray[i].contains(userSearchContactName)) {
                                System.out.println("-------");
                                System.out.println(searchArray[0] + searchArray[1] + " :" + searchArray[2]);
                                System.out.println("-------");
                            }
                        }
                    }
                    keepLooking = true;
                    break;

                case 4:
//                    System.out.println("Type in name or number of contact you wish to delete.");
//                    String userDeleteContactName = input.getString();
//
//                    String[] deleteArray;
//                    for (String contact : contactList) {
//                        deleteArray = contact.split(",");
//
//                        for (int i = 0; i < deleteArray.length - 1; i++) {
//                            if (deleteArray[i].contains(userDeleteContactName)) {
//                                deleteArray = ArrayUtils.removeElement(deleteArray, i);
//
//                                System.out.println("-------");
//
////                                System.out.println(deleteArray[0] + deleteArray[1] + " :" + deleteArray[2]);
//                                System.out.println("-------");
//                            }
//                        }
//                    }

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
