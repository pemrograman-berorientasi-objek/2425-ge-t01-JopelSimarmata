package fintech.model;



/**
 * @author 12S23036 Jopel Simarmata
 * @author 12S23024 Eska Silaen
 */
public class Account {

    private String owner,accountName;
    private double balance = 0.0;

    public Account(String owner, String accountName){
        this.owner = owner;
        this.accountName = accountName;
    }

    public String toString(){
        return this.accountName + "|" + this.owner + "|" + this.balance;
    }



}