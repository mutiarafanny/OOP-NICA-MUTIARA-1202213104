package MODUL3;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        Calculation square = new Calculation();
        double square;
        boolean repeat = true;
        boolean report = false;
    } 

    do {
        try {
            switch () {
                case 1:
                    Thread thread1 = new Thread(square);
                    break;
                case 2:
                    Thread thread2 = new Thread (circle);
                    break;
                case 3:
                    Thread thread3 = new Thread(trapezoid);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Option not Available");
                    continue;

                thread1.start();
                thread2.start();
                thread3.start();
                thread1.join();
                thread2.join();
                thread3.join();
            }
            repeat = 

        } catch (InputMismatchException) {
            System.out.println("Input must be a number");
        } catch (IllegalAccessException) {
            System.out.println("Input must be a number");
        } catch (InterruptedException) {
            System.out.println("Input must be a number");
        }
    } while ();
    scannerName.close();
}
