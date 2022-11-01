package MODUL1;

import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        // TODO Create Database
        Database db = new Database();

        // TODO Create Menu
        Menu menu1 = new Menu();
        menu1.setName ("Bakso");
        menu1.setCategory ("Makanan");
        menu1.setPrice ("10000");

        Menu menu2 = new Menu();
        menu2.setName ("Es Teh");
        menu2.setCategory ("Minuman");
        menu2.setPrice ("5000");

        Menu menu3 = new Menu();
        menu3.setName ("Brownies");
        menu3.setCategory ("Dessert");
        menu3.setPrice ("15000");

        // TODO Insert Menu to Database
        db.insertMenu(menu1);
        db.insertMenu(menu2);
        db.insertMenu(menu3);

        // TODO Display Main Menu and User must be Register First
        System.out.println("Selamat Datang di Restoran EAD");
        System.out.println("Silahkan Register Terlebih Dahulu");

        // TODO Create User from register in Main Menu

        // TODO Display Menu
        System.out.println("Menu");

    }
}
