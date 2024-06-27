package com.coforge;

public class AccountMain {
    public static void main(String[] args) {
        try {
            Account account = new Account();
            account.setAccountNo(12);
            account.setAccountName("Babli Badmos");
            account.setAccountBalance(8999);
            System.out.println("account info");
            System.out.println("\taccount no : " + account.getAccountNo());
            System.out.println("\taccount name : " + account.getAccountName());
            System.out.println("\taccount balance : " + account.getAccountBalance());
        }catch(AccountException e){
            System.err.println(e);
        }

    }

}
