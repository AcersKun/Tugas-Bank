public class Bank {
    private Nasabah[] daftarNasabah = new Nasabah[10];
    private int jumlahNasabah = 0;

    public Bank() {
    }
    public void tambahNasabah (String namaDepan, String namaBelakang) {
        if (jumlahNasabah < daftarNasabah.length) {
            daftarNasabah[jumlahNasabah++] = new Nasabah(namaDepan, namaBelakang);
        }
    }

    public int getJumlahnasabah() {
        return jumlahNasabah;
    }

    public Nasabah getNasabah(int indeks) {
        if (indeks >= 0 && indeks < jumlahNasabah) {
            return daftarNasabah[indeks];
        }
        return null;
    }
}