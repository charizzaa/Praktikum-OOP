package Soal2;

public class Pegawai extends THR{

    private int gaji;

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }


    @Override
    public void THR(Pelajar pelajar) {
        int jumlahTHR = (pelajar.getUmur() * 10 / 5 ) * 1000;
        int sisaGaji = gaji - jumlahTHR;
        this.gaji = sisaGaji;
        pelajar.setJumlahTHR(jumlahTHR);
        System.out.println("Pegawai " + super.getNama() + " memberikan THR kepada pelajar " + pelajar.getNama()
                + " sebanyak Rp" + jumlahTHR + " dengan sisa gaji sebanyak Rp" + sisaGaji);
        System.out.println("Jumlah total uang THR pelajar " + pelajar.getNama() + " = " + pelajar.getJumlahTHR());
    }
}
