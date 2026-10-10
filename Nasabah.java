public class Nasabah {
    private String namaDepan;
    private String namaBelakang;
    private Rekening[] daftarRekening = new Rekening[10];
    private int jumlahRekening = 0;

    public Nasabah(String depan, String belakang) {
        this.namaDepan = depan;
        this.namaBelakang = belakang;
    }

    public String getnamaDepan() {
        return namaDepan;
    }

    public String getnamaBelakang() {
        return namaBelakang;
    }

    // Menambahkan rekening baru
    public void tambahRekening(Rekening rekeningBaru) {
        if (jumlahRekening < daftarRekening.length) {
            daftarRekening[jumlahRekening++] = rekeningBaru;
        }
    }

    public Rekening getAccount(int indeks) {
        if (indeks >= 0 && indeks < jumlahRekening) {
            return daftarRekening[indeks];
        }
        return null;
    }

    public int getJumlahRekening() {
        return jumlahRekening;
    }
}