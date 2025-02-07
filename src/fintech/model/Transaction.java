package fintech.model;


/**
 * @author 12S23036 Jopel Simarmata
 * @author 12S23024 Eska Silaen
 */
public class Transaction {

    String accountName;
    double amount;
    String posted_at;
    String note;

    public Transaction(String accountName, double amount, String posted_at, String note){
        this.accountName = accountName;
        this.amount = amount;
        this.posted_at = posted_at;
        this.note = note;
    }

    public void showTransaction(){
        System.out.println("1"+"|"+ this.accountName + "|" + this.amount + "|" + this.posted_at + "|" + this.note +"|" + this.amount);
    }

    

}