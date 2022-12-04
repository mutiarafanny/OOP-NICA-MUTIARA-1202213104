package TPMODUL2;

public class MainApp {
    public static void main(String[] args) {
        
        Perangkat perangkat1 = new Perangkat("Adata",2,(float)1.80);
        Laptop laptop1 = new Laptop("Seagate", 8, (float)2.40, true);
        Handphone handphone1 = new Handphone("Sandisk", 3, (float)2.20, false);

        perangkat1.informasi();
        System.out.println();
        laptop1.informasi();
        laptop1.bukaGame("Dota 2");
        laptop1.kirimEmail("mutiarafanny@student.telkomuniversity.ac.id");
        laptop1.kirimEmail("hi.mutiarafanny@gmail.com", "mutiarafanny2003@gmail.com");

        System.out.println();
        handphone1.informasi();
        handphone1.telfon(628587026);
        handphone1.kirimSMS(628587026);
        handphone1.kirimSMS(628139283, 628315497);
    }
}
