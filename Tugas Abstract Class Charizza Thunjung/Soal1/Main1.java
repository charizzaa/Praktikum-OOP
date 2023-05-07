package Soal1;

public class Main1 {
    public static void main(String[] args) {
        //testing prisma segitiga
        PrismaSegitiga ps3 = new PrismaSegitiga();
        ps3.setAlas(3);
        ps3.setTinggiAlas(4);
        ps3.setTinggi(15);
        System.out.println(ps3);

        //testing tabung
        Tabung t = new Tabung();
        t.setJari2(7);
        t.setTinggi(10);
        System.out.println(t);
    }
}
