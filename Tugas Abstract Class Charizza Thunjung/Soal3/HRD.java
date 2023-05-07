package Soal3;

public class HRD extends Pegawai{
    @Override
    public String THR() {
        return "THR yang didapat HRD "+ super.getNama() + " = " + (300000 + (Math.floor(super.getLamaBekerja() / 2) * 100.000));
    }
}
