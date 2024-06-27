public class AccountMain {
    public static void main(String[] args) {
        SavingAccount savingAccount=new SavingAccount(1,"Harsh",700000,0.04f,4,"haryana");
//        Account account=new Account(1,"Harsh",700000,0.04f);
        System.out.println("Account data");
        System.out.println("\t id "+savingAccount.getActId());
        System.out.println("\t Name "+savingAccount.getActName());
        System.out.println("\t Balance "+savingAccount.getBalance());
        System.out.println("\t rate "+savingAccount.getRate());
        System.out.println("\t interset "+savingAccount.interest());
        System.out.println("\t location "+savingAccount.getLocation());
        System.out.println("\t time "+savingAccount.getTime());
        savingAccount.deposit(700000);
        System.out.println(savingAccount.getBalance());

        savingAccount.withdraw(6000);
        System.out.println(savingAccount.getBalance());

        savingAccount.withdraw(6000);
        System.out.println(savingAccount.getBalance());



    }
}
