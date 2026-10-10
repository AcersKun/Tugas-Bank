public class Rekening {
    private double saldo;

    public Rekening(double saldoAwal) {
        if (saldoAwal > 0.0) {
            this.saldo = saldoAwal;
        } else {
            this.saldo = 0.0;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean setorUang(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            return true;
        }
        return false;
    }

    public boolean tarikUang(double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            return true;
        }
        return false;
    }
}