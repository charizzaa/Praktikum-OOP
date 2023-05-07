package Soal3;

public class Manager extends Pegawai{
    @Override
    public String THR() {
        return "THR yang didapat Manager "+ super.getNama() + " = " + (Math.ceil(super.getLamaBekerja() / 3) * 300000);
    }
}
