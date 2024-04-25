package main.java.com.magicvet.service;

import main.java.com.magicvet.Main;
import main.java.com.magicvet.model.Client;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class ClientService {

    private static  String EMAIL_PATTERN = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

   private static String NAME_PATTERN = "[a-zA-Z]{3,}(-[a-zA-Z]{3,})?$";

    public Client registerNewClient() {

       Client client = null;

        System.out.println("Please, provide client details");
        System.out.print("Email: ");
        String email = Main.SCANNER.nextLine();

        if (isEmailValid(email)) {
           client = buildClient(email);
            System.out.println("New client: " + client.getFirstName()
                    + " " + client.getLastName() + " " + " ("
                    + client.getEmail() + ")");
        } else {
            System.out.println("Provided email is invalid");
        }
        return client;
    }

    private static Client buildClient(String email) {
        Client client = new Client();
        client.setEmail(email);

        System.out.println("First name: ");
        String firstName = Main.SCANNER.nextLine();
        while (!isNameValid(firstName)){
            System.out.println("Invalid first name format. Please, enter again: ");
            firstName = Main.SCANNER.nextLine();
        }
        client.setFirstName(firstName) ;

        System.out.println("Last name: ");
        String lastName = Main.SCANNER.nextLine();
        while (!isNameValid(lastName)) {
            System.out.println("Invalid last name format. Please, enter again: ");
            lastName = Main.SCANNER.nextLine();
        }
        client.setLastName(lastName); ;
        return client;
    }

    private static boolean isEmailValid(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean isNameValid(String name) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}
