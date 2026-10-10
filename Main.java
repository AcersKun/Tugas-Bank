public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Budi", "Santoso");
        
        System.out.println("=== INFORMASI NASABAH ===");
        System.out.println("Nama Nasabah : " + customer.getFirstName() + " " + customer.getLastName());
        
        akun account = new akun(1000000.0);
        customer.setAccount(account);
        
        // Perhatikan penambahan angka (0) di dalam getAccount(0)
        System.out.println("Saldo awal   : Rp " + customer.getAccount(0).getBalance());
        
        System.out.println("\nMelakukan deposit sebesar Rp 500.000...");
        boolean depositSuccess = customer.getAccount(0).deposit(500000.0);
        if (depositSuccess) {
            System.out.println("Deposit berhasil!");
        }
        System.out.println("Saldo saat ini: Rp " + customer.getAccount(0).getBalance());
        
        System.out.println("\nMelakukan penarikan (withdraw) sebesar Rp 300.000...");
        boolean withdrawSuccess = customer.getAccount(0).withdraw(300000.0);
        if (withdrawSuccess) {
            System.out.println("Penarikan berhasil!");
        } else {
            System.out.println("Penarikan gagal, saldo tidak mencukupi.");
        }
        
        System.out.println("Saldo akhir  : Rp " + customer.getAccount(0).getBalance());
    }
}