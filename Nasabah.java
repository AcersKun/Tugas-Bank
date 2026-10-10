public class Customer {
    private String firstName;
    private String lastName;
    private akun[] accounts = new akun[5]; // Array dengan kapasitas 5
    private int numberOfAccounts = 0;

    // Konstruktor
    public Customer(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // Menambahkan akun ke dalam array
    public void setAccount(akun acct) {
        if (numberOfAccounts < accounts.length) {
            accounts[numberOfAccounts++] = acct;
        }
    }

    // Mengambil akun berdasarkan indeks
    public akun getAccount(int account_index) {
        if (account_index >= 0 && account_index < numberOfAccounts) {
            return accounts[account_index];
        }
        return null;
    }

    // Mengambil jumlah akun saat ini
    public int getNumOfAccounts() {
        return numberOfAccounts;
    }
}