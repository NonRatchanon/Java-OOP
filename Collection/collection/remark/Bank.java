import java.util.*;

public class Bank {

    private String bankName;
    private int totalAccount;
    private Set<Account> accountList;

    public Bank (String bankName) {
        totalAccount = 0;
        this.bankName = bankName;
        accountList = new HashSet<Account>();
    }

    public void setBankName (String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public void addAccount (Account account) {
        accountList.add(account);
        totalAccount++;
    }

    public void accountList() {
        Iterator it = accountList.iterator();
        while (it.hasNext()) {
        Account account = (Account) it.next();
            System.out.printf("%s\n", account.getAccountNumber());
            System.out.printf("%s\n", account.getName());
            System.out.printf("%.2f\n", account.getBalance());
            System.out.println();
        }
    }

}