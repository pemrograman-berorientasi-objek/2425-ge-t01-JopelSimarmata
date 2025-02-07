package fintech.driver;
import fintech.model.Account;
import java.util.Scanner;

/**
 * @author 12S23036 Jopel Simarmata
 * @author 12S23024 Eska Silaen
 */
public class Driver1 {

    public static void main(String[] _args) {

        Scanner scn = new Scanner(System.in);

        String command = scn.nextLine();
        String owner = scn.nextLine();
        String accountName = scn.nextLine();

        Account account = new Account(owner, accountName);
        System.out.println(account.toString());

    }

}