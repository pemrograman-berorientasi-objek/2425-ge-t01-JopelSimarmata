package fintech.model;


/**
 * @author 12S23036 Jopel Simarmata
 * @author 12S23024 Eska Silaen
 */
public class Transaction {

    private String accountName;
    private String amount;
    private String posted;
    private String note;

    public Transaction(String accountName, String amount, String posted_at, String note){
        this.accountName = accountName;
        this.amount = amount;
        this.posted = posted_at;
        this.note = note;
    }


    public void showTransaction(){
        System.out.println("1"+"|"+ this.accountName + "|" + this.amount + "|" + this.posted + "|" + this.note +"|" + this.amount);
    }
    @Override
    public String toString(){
        return this.accountName + this.note + this.posted;
    }

    

}