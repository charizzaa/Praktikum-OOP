package Soal1;

public abstract class Prisma {
    private int tinggi;

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    //abstract method
    public abstract double volume();
    public abstract double luasPermukaan();
    public abstract double luasAlas();

    @Override
    public String toString() {
        return "Prisma tersebut memiliki volume sebesar " + volume() + " dan luas permukaan sebesar " +
                luasPermukaan();
    }
}
