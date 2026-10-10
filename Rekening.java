public class akun {
    // Atribut private untuk menyimpan saldo
    private double balance;

    // Kontruktor untuk inisialisasi saldo awal
    public akun(double init_balance) {
        if (init_balance > 0.0) {
            this.balance = init_balance;
        } else {
            this.balance = 0.0;
        }
    }

    // Method getter untuk mengembalikan saldo saat ini
    public double getBalance() {
        return balance;
    }

    // Method untuk menambah saldo (deposit)
    public boolean deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            return true;
        }
        return false;
    }

    // Method untuk menarik saldo (withdraw)
    public boolean withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            return true;
        }
        return false;
    }
}