package Soal3;

public abstract class Pegawai {
    private String nama;
    private int umur, lamaBekerja;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getLamaBekerja() {
        return lamaBekerja;
    }

    public void setLamaBekerja(int lamaBekerja) {
        this.lamaBekerja = lamaBekerja;
    }

    public abstract String THR();
}
