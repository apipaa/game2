
package game2;
import java.util.Scanner;
public class Game2 {

   
    public static void main(String[] args) {
       
       Scanner scanner = new Scanner(System.in);
       
       drone Titan = new drone();
       Titan.energi= 90;
       Titan.ketinggian = 50;
       Titan.kecepatan = 99;
       
       Titan.belok();
       Titan.maju();
       Titan.matikanMesin();
       Titan.mundur();
       Titan.turun();
       Titan.terbang();
       
        System.out.println("Jalankan Dronenya!");
        // Meng set kecepatan drone
//        System.out.print("Masukkan kecepatan yang kamu inginkan pada drone: ");
//        String kecepatanDrone = scanner.nextLine();
        if (Titan.terbang()) {
            System.out.println("drone terbang");
        }else{
            System.out.println("game over");
        }
    
}
}
