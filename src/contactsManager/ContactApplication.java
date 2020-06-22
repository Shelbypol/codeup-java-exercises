package contactsManager;
import utils.Input;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class ContactApplication {

    static Input input = new Input();

    public static void main(String[] args) throws IOException {

        //PATCH TO CONTACTS
        Path contacts = Paths.get("src/contactsManager", "contacts.txt");
        //READ CONTACTS
        List<String> contactList = Files.readAllLines(contacts);

        //DO-WHILE CONDITION
        boolean keepLooking = true;

        do {
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
                    System.out.println("Please enter contact name below.");
                    String userInput = input.getString();
                    Files.write(contactList , userInput , StandardOpenOption.APPEND);
                    keepLooking = true;
                    break;
                case 3:

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
