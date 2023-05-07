package Soal3;

public class OB extends Pegawai{
    @Override
    public String THR() {
        return "THR yang didapat OB "+ super.getNama() + " = " + (super.getLamaBekerja() * 50.000 + 200.000);
    }
}
