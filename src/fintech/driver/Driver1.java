package fintech.driver;
import fintech.model.Account;
import java.util.Scanner;

/**
 * @author NIM Nama
 * @author NIM Nama
 */
public class Driver1 {

    public static void main(String[] _args) {

        Scanner scn = new Scanner(System.in);

        String command = scn.nextLine();
        String owner = scn.nextLine();
        String accountName = scn.nextLine();

        Account account = new Account(owner, accountName);


    }

}