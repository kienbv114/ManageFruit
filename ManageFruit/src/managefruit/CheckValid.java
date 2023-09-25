/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package managefruit;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class CheckValid {
    private Scanner sc ;
    
    public CheckValid() {
        sc = new Scanner(System.in) ;
    }
    public int getInt(String mess) {
        while (true) {            
            try {
                System.out.println(mess);
                int intput = sc.nextInt() ;
                if(intput >= 0 && String.valueOf(intput).length() <= 6) {
                    return intput ;
                }
                else {
                    System.out.println("Vui long thu lai");
                }
            } catch (Exception e) {
                System.out.println("Vui long nhap dung du lieu");
                sc.nextLine() ;
            }
        }
    }
    public String getName(String mess) {
        while (true) {  
            try {
                System.out.println(mess);
                String intput = sc.nextLine();
                if(intput.matches("[a-zA-Z]+")&& intput != null)
                    return intput ;
            } catch (Exception e) {
                System.out.println("Vui long nhap dung du lieu");
                sc.nextLine() ;
            }
        }
    }
    public double getDouble(String mess) {
        while (true) {            
            try {
                System.out.println(mess);
                double doubput = sc.nextDouble();
                if(doubput>=0 && String.valueOf(doubput).length() <= 6)
                return doubput ;
                else {
                    System.out.println("Vui long thu lai");
                }
            } catch (Exception e) {
                System.out.println("Vui long nhap dung du lieu");
                sc.nextLine() ;
            }
        }
    }
    public String getOrigin(String mess) {
                System.out.println(mess);
                sc.nextLine() ;
                String intput = sc.nextLine();
                while (intput.isEmpty()) {            
                System.out.println("Vui long nhap dung du lieu");
                intput = sc.nextLine() ;
            }
                return intput ;
    }
}
