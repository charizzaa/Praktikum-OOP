package Soal2;

public class Pelajar extends THR{
    private int umur, jumlahTHR;

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getJumlahTHR() {
        return jumlahTHR;
    }

    public void setJumlahTHR(int jumlahTHR) {
        this.jumlahTHR += jumlahTHR;
    }

    @Override
    public void THR(Pelajar pelajar) {

    }
}
