package fintech.model;



/**
 * @author 12S23036 Jopel Simarmata
 * @author 12S23024 Eska Silaen
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