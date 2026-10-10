public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // 1. Menambahkan nasabah
        bank.tambahNasabah("Putu", "Dartana");
        bank.tambahNasabah("Dewa", "Krisna");

        System.out.println("=== DATA BANK ===");
        System.out.println("Total Nasabah Terdaftar: " + bank.getJumlahnasabah());

        // 2. Mengambil nasabah pertama menggunakan getNasabah(0)
        Nasabah nasabah1 = bank.getNasabah(0);
        if (nasabah1 != null) {
            Rekening rekeningPutu = new Rekening(1000000.0);
            nasabah1.tambahRekening(rekeningPutu);

            System.out.println("\nNasabah 1: " + nasabah1.getnamaDepan() + " " + nasabah1.getnamaBelakang());
            System.out.println("Saldo Rekening ke-1: Rp " + nasabah1.getAccount(0).getSaldo());
        }
        // 3. Mengambil nasabah kedua menggunakan getNasabah(1)
        Nasabah nasabah2 = bank.getNasabah(1);
        if (nasabah2 != null) {
            Rekening rekeningDewa = new Rekening(2500000.0);
            nasabah2.tambahRekening(rekeningDewa);

            System.out.println("\nNasabah 2: " + nasabah2.getnamaDepan() + " " + nasabah2.getnamaBelakang());
            System.out.println("Saldo Rekening ke-1: Rp " + nasabah2.getAccount(0).getSaldo());
        }
    }
}