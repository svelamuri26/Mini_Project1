package MiniProject_BankingSystem;


class BankBalance {
    private double balance;

    public BankBalance(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }


    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        BankBalance balance = new BankBalance(100.0);
        Customer customer = new Customer(balance, 20.0);

        Thread thread1 = new Thread(customer);


        thread1.start();


        try {
            thread1.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance: " + balance.getBalance());
    }
}