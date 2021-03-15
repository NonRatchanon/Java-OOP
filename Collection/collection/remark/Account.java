public class Account {

    private String accountNumber;
    private String name;
    private double balance;

    public Account (String accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public void setAccountNumber (String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean equals (Account account) {
        return (accountNumber.equals(account.accountNumber));
    }

}