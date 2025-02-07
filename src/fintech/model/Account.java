package fintech.model;



/**
 * @author NIM Nama
 * @author NIM Nama
 */
public class Account {

    String owner;
    String accountName;
    public float balance = 0;

    public Account(String owner, String accountName){
        this.owner = owner;
        this.accountName = accountName;

        System.out.println(this.accountName+"|"+this.owner+"|"+this.balance);
    }



}