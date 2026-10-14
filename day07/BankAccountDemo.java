class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Amaan", 5000);

        System.out.println("Account holder: "
                + account.getAccountHolder());
        System.out.println("Initial balance: "
                + account.getBalance());

        account.deposit(2000);
        account.withdraw(1500);
        account.withdraw(10000);

        System.out.println("Final balance: "
                + account.getBalance());
    }
}