/*
   GBK.java
    
   Created at Jul 04, 11:43 AM:18 
*/

import java.util.Random;
import java.util.Scanner;

/**
 * @author jeddi
 */
public class GBK {

    static Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    int player, enemy;

    public GBK() {
        welcomeMessage();

        // Minta input ke player
        player = scan.nextInt();
        player -= 1;

        // Generate random number 1 ~ 3
        enemy = rand.nextInt(3);

        System.out.println();
        if (player >= 0 && player < 3) {
            System.out.println("Player = " + convert(player));
            System.out.println("Enemy  = " + convert(enemy));


            battle(player, enemy);
        } else {
            System.out.println("Pilihan Invalid");
        }
        System.out.println();

    }

    private void welcomeMessage() {
        System.out.println("Selamat datang di permainan Gunting Batu Kertas");
        System.out.println(
                "Silahkan pilih jagoanmu : \n" +
                        "1. Gunting \n" +
                        "2. Batu \n" +
                        "3. Kertas \n" +
                        "-->"
        );
    }

    private String convert(int choose) {
        switch (choose) {
            case 0:
                return "Gunting";
            case 1:
                return "Batu";
            case 2:
                return "Kertas";
            default:
                throw new IllegalStateException("Unexpected value: " + choose);
        }
    }

    private void battle(int player, int enemy) {
        /*
        0. Gunting
        1. Batu
        2. Kertas

        rule 0 < 1 < 2 < 0
         */

        if (player != enemy) {
            if ((player == 2 || player == 0) && (enemy == 2 || enemy == 0)) {
                if (player > enemy) {
                    System.out.println("Kamu kalah");
                } else {
                    System.out.println("Kamu menang");
                }
            } else if (player < enemy) {
                System.out.println("Kamu kalah");
            } else {
                System.out.println("Kamu menang");
            }

        } else {
            System.out.println("Seimbang");
        }

    }

    public static boolean isLoop() {
        System.out.println("Lanjut ? Y / N");
        String ans = scan.next();

        return "Y".equals(ans);
    }

}
