public class KhuanpringBankDemo {

    public static void main (String [] args) {
        Bank kpb = new Bank("Khuanpring Bank");
        Account acc1 = new Account("1234", "Dang", 1200);
        Account acc2 = new Account("1234", "Khao", 100);
        kpb.addAccount(acc1);
        if (!acc1.equals(acc2)) {
            kpb.addAccount(acc2);
        } else {
            System.out.println("Duplicated account number!");
        }
        System.out.println();
        acc2.setAccountNumber("1235");
        kpb.addAccount(acc2);
        kpb.accountList();
    }

}