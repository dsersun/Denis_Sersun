package homework_nr_17;

import lombok.Data;
import java.util.ArrayList;
import java.util.UUID;

@Data
public class Client {
    private String ClientID;
    private String FirstName;
    private String LastName;
    private String DateOfBirth;
    public ArrayList<String> AssociatedAccounts;

    public Client (String firstName, String lastName, String dateOfBirth) {
        ClientID = String.valueOf (UUID.randomUUID ());
        FirstName = firstName;
        LastName = lastName;
        DateOfBirth = dateOfBirth;
        AssociatedAccounts = new ArrayList<> ();
    }




    public void ViewClientInfo() {
        int i = 1;
        System.out.println ("------------------------------------------------------------");
        System.out.println ("| Client: " + getFirstName () + " " + getLastName ());
        System.out.println ("| Date of birth: " + getDateOfBirth ());
        System.out.println ("| Client ID: " + getClientID ());
        System.out.println ("------------------------------------------------------------");
        System.out.println ("| Opened accounts: ");
        if (AssociatedAccounts.size () > 0) {
            for (String an : AssociatedAccounts) {
                System.out.println ("|Account # " + i++ + " : " + an);
            }
            System.out.println ("------------------------------------------------------------");
        }
    }
}
