package Soal3;

public class Main3 {
    public static void main(String[] args) {
        Manager manager1 = new Manager();
        manager1.setNama("Caca");
        manager1.setUmur(25);
        manager1.setLamaBekerja(10);
        System.out.println(manager1.THR());

        OB OB1 = new OB();
        OB1.setNama("Rizki");
        OB1.setUmur(50);
        OB1.setLamaBekerja(20);
        System.out.println(OB1.THR());

        HRD HRD1 = new HRD();
        HRD1.setNama("Olis");
        HRD1.setUmur(25);
        HRD1.setLamaBekerja(10);
        System.out.println(HRD1.THR());
    }
}
