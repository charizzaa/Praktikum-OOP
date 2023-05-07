package Soal1;

public class Tabung extends Prisma{
    private int jari2;

    public int getJari2() {
        return jari2;
    }

    public void setJari2(int jari2) {
        this.jari2 = jari2;
    }

    public double getKelilingLingkaran(){
        double kelilingLingkaran = 3.14 * 2 * jari2;
        return kelilingLingkaran;
    }

    @Override
    public double luasAlas() {
        double luasAlas = 3.14 * Math.pow(jari2,2);
        return luasAlas;
    }

    @Override
    public double volume() {
        double volume = this.luasAlas() * super.getTinggi();
        return volume;
    }

    @Override
    public double luasPermukaan() {
        double luasPermukaan = this.luasAlas() * 2 + this.getKelilingLingkaran() * super.getTinggi();
        return luasPermukaan;
    }

}
