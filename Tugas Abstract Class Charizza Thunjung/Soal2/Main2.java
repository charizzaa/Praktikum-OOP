package Soal2;

public class Main2 {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai();
        pegawai1.setNama("Caca");
        pegawai1.setGaji(5000000);

        Pelajar pelajar1 = new Pelajar();
        pelajar1.setNama("Olis");
        pelajar1.setUmur(20);

        Pelajar pelajar2 = new Pelajar();
        pelajar2.setNama("Radit");
        pelajar2.setUmur(15);

        pegawai1.THR(pelajar1);
        System.out.println();
        pegawai1.THR(pelajar1);
        System.out.println();
        pegawai1.THR(pelajar2);
    }
}
