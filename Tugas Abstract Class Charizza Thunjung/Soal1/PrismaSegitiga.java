package Soal1;

public class PrismaSegitiga extends Prisma{
    private int alas, tinggiAlas;

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getTinggiAlas() {
        return tinggiAlas;
    }

    public void setTinggiAlas(int tinggiAlas) {
        this.tinggiAlas = tinggiAlas;
    }

    public double getMiring(){
        double miring = (Math.sqrt(alas*alas + tinggiAlas*tinggiAlas));
        return miring;
    }

    @Override
    public double luasAlas() {
        double luasAlas = 0.5 * alas * tinggiAlas;
        return luasAlas;
    }
    @Override
    public double volume() {
        double volume = this.luasAlas() * super.getTinggi();
        return volume;
    }

    @Override
    public double luasPermukaan() {
        double luasPermukaan = this.luasAlas()*2 + getMiring()*getTinggi() + getMiring()*getTinggi();
        return luasPermukaan;
    }
}
