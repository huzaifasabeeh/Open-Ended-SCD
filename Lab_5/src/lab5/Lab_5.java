package lab5;

class BankAccount {
    private int balance = 50000;

    synchronized void withdraw(String user, int amount) {
        System.out.println(user + " is trying to withdraw: " + amount);

        if (balance >= amount) {
            System.out.println(user + " withdrawal in progress...");
            balance -= amount;
            System.out.println(user + " withdrawal successful.");
        } else {
            System.out.println("Insufficient balance for " + user);
        }

        System.out.println("Remaining balance: " + balance);
        System.out.println("--------------------------------");
    }
}

class User extends Thread {
    BankAccount account;
    String userName;
    int amount;

    User(BankAccount account, String userName, int amount) {
        this.account = account;
        this.userName = userName;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(userName, amount);
    }
}

public class Lab_5 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        User userA = new User(account, "User A", 45000);
        User userB = new User(account, "User B", 20000);

        userA.start();
        userB.start();
    }
}
