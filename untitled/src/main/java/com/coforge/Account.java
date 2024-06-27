package com.coforge;

public class Account {
    private int accountNo;
    private String accountName;
    private float accountBalance;

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) throws AccountException{
        if(accountNo<=0){
            throw new AccountException("tumse na ho paega");
        }
        this.accountNo = accountNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) throws AccountException {
        if(accountName.isBlank()){
            throw new AccountException("benaam saale");
        }
        if(accountName.length()<5){
            throw new AccountException("bohot chota h aapka                                                                                                    naam");
        }
        if(accountName.length()>15){
            throw new AccountException("bohot bada h aapka                                                                                                    naam");
        }



        this.accountName = accountName;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) throws AccountException {
        if(accountBalance<0){
            throw new AccountException("behn te lan autaat m");
        }
        this.accountBalance = accountBalance;
    }

}
