public class Account {
    private int actId;
    private String actName;
    private float balance;
    private final float rate;


    public Account(int actId, String actName, float balance, float rate) {
        this.actId = actId;
        this.actName = actName;
        this.balance = balance;
        this.rate = rate;
    }

    public int getActId() {
        return actId;
    }

    public void setActId(int actId) {
        this.actId = actId;
    }

    public String getActName() {
        return actName;
    }

    public void setActName(String actName) {
        this.actName = actName;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getRate() {
        return rate;
    }
    public void withdraw(float amt){
        balance=balance-amt;
    }
    public void deposit(float amt){
        balance=balance+amt;
    }


}
