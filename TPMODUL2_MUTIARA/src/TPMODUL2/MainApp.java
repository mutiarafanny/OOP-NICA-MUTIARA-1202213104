package TPMODUL2;

public class MainApp {
    public static void main(String[] args) {
        
        Perangkat perangkat = new Perangkat("Adata", 2, (float)1.80);
        Laptop laptop = new Laptop("Seagate", 8, (float)2.40, true);
        Handphone handphone = new Handphone("Sandisk", 3, (float)2.20, false);

        perangkat.informasi();
        System.out.println();
        laptop.informasi();
        laptop.bukaGame("Dota 2");
        laptop.kirimEmail("mutiarafanny@student.telkomuniversity.ac.id");
        laptop.kirimEmail("hi.mutiarafanny@gmail.com", "mutiarafanny2003@gmail.com");

        System.out.println();
        handphone.informasi();
        handphone.telfon(628587026);
        handphone.kirimSMS(628587026);
        handphone.kirimSMS(628139283, 628315497);
    }
}
