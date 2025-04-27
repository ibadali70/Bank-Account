//Ibad Ali
package Practice;

class Account {
    int amt;
    private int balance = 5000;

    void setBalance(int amt) {
        balance = amt;
    }

    public int getBalance() {
        return balance;
    }
}

class ATM {
    Account user;

    ATM() {
        user = new Account();
    }

    void balanceCheck() {
        System.out.println("Current Balance: " + user.getBalance());
    }

    void withdraw(int amount) {
        int bal = user.getBalance();
        if (bal >= 500 && amount <= bal) {
            if (amount % 500 == 0) {
                bal = bal - amount;
                user.setBalance(bal);
                System.out.println("Withdrawal Successful. New Balance: " + bal);
            } 
            else {
                System.out.println("Invalid Amount (must be a multiple of 500)");
            }
        } 
        else {
            System.out.println("Low Balance");
        }
    }
}
