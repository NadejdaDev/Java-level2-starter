package nfort.com.oop.lesson25.account;

public class AccountDemo {

    public static void main(String[] args) {
        var account1 = new Account(20000);
        var account2 = new Account(20000);

        var thread1 = new AccountThread(account1, account2);
        var thread2 = new AccountThread(account2, account1);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();

        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(account1);
        System.out.println(account2);
    }
}
