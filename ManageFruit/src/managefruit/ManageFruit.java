/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package managefruit;

import java.time.Clock;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ManageFruit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu a = new Menu();
        Scanner sc = new Scanner(System.in);
        String[] options = {"Create Fruit", "View Order", "Shopping(for buyer)", "Exit"};
        int choice;
        FruitMananger boss = new FruitMananger();
        do {
            System.out.println("------Menu------");
            choice = a.getChoice(options);
            switch (choice) {
                case 1:
                    boss.creatFruit();
                    break;
                case 2:
                    boss.viewOrder();
                    break;
                case 3:
                    boss.shopping();
                    break;
                case 4:
                    System.out.println();
                    break;
                default:
                    throw new AssertionError();
            }
        } while (true);
    }
}
