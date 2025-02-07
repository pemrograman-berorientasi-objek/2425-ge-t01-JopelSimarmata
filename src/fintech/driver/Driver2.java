package fintech.driver;
import fintech.model.Account;
import fintech.model.Transaction;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author 12S23036 Jopel Simarmata
 * @author 12S23024 Eska Silaen
 */
public class Driver2 {

    public static void main(String[] _args) {

        Scanner scn = new Scanner(System.in);

        String command = scn.nextLine();
        String owner = scn.nextLine();
        String accountName = scn.nextLine();


        Account account = new Account(owner, accountName);
        System.out.println(account.toString());



        String command1 = scn.nextLine();
        String accountName2 = scn.nextLine();
        String amount = scn.nextLine();
        String posted_at = scn.nextLine();
        String note = scn.nextLine();
        scn.close();


        Transaction transaction = new Transaction(accountName2, amount, posted_at, note);
        // System.out.println(transaction.toString());
        transaction.showTransaction();


    }

}