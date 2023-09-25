/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package managefruit;

import java.util.Hashtable;
import java.util.ArrayList;
import java.util.Scanner;
public class FruitMananger {
   private ArrayList<Fruit> fruitList ;
   private Hashtable<String,ArrayList<Fruit>> hashTable ;
   
   public FruitMananger() {
       fruitList = new ArrayList<>() ;
       hashTable = new Hashtable<>() ;
   }
        CheckValid data = new CheckValid() ;
        
        public void creatFruit() {
        Scanner sc = new Scanner(System.in) ;
            while (true) {                
                String nameF = data.getName("Enter Name Fruit") ;
                int idF = data.getInt("Enter ID Fruit") ;
                double priceF = data.getDouble("Enter price Fruit") ;
                int quantityF = data.getInt("Enter Quantity Fruit") ;
                String originF = data.getOrigin("Enter Origin Fruit") ;
                Fruit py = new Fruit(idF, nameF, priceF, quantityF, originF);
                fruitList.add(py) ;
                System.out.println("Do you want to continue (Y/N)");
                String choice = sc.nextLine() ;
                if(choice.equalsIgnoreCase("Y")) {
                    continue ;
                }
                else {
                    break ;
                }
            }
      }
      public void shopping() {
    ArrayList<Fruit> listBought = new ArrayList<>();
    exportFruit();
    
    while (true) {
        int selected = data.getInt("To order, customer selects Item");

        Fruit selectedFruit = null;
        for (Fruit fruit : fruitList) {
            if (fruit.getFruitid() == selected) {
                selectedFruit = fruit;
                System.out.println("Your Selected: " + fruit.getFruitname());
                break;
            }
        }
        
        if (selectedFruit != null) {
            int quantity = data.getInt("Please input quantity:");
            selectedFruit.setFquantity(quantity);
            listBought.add(selectedFruit);
        }

        String op = data.getOrigin("Do you want to buy? (Yes or No)");
        if (op.equalsIgnoreCase("Y")) {
            break;
        }
    }
    
    if (!listBought.isEmpty()) {
        System.out.println("Product | Quantity | Price | Amount ");
        double total = 0;
        for (Fruit fruit : listBought) {
            double amount = fruit.getFquantity() * fruit.getFprice();
            System.out.printf("|%-10s | %-15s | %-12s |%-12s| \n",
                    fruit.getFruitname(),
                    fruit.getFquantity(),
                    fruit.getFprice() + "$",
                    amount + "$");
            total += amount;
        }
        System.out.println("Total: " + total);

        String nameCustomer = data.getName("Please Input Your Name:");
        hashTable.put(nameCustomer, listBought);
        System.out.println();
        System.out.println("Input Successful");
    }
}
      public void exportFruit() {
          System.out.println("List of Fruit");
          System.out.println("| ++ Item ++ | ++ Fruit Name ++ | ++ Origin ++ | ++ Price ++ | ");
      for (Fruit fruit : fruitList) {
            System.out.printf("|%-10s | %-15s | %-12s |%-12s| \n",
            fruit.getFruitid(),
            fruit.getFruitname(),
            fruit.getForigin(),
            fruit.getFprice() + "$") ;
      }
      }
     public void viewOrder() {
        for (String nameCutomer : hashTable.keySet()) {
            System.out.println("Customer :" + nameCutomer);
            System.out.println("Product | Quantity | Price | Amount");
            double total = 0;
            for (Fruit f : hashTable.get(nameCutomer)) {
                System.out.printf("|%-10s | %-15s | %-12s |%-12s| \n",
                        f.getFruitname(),
                        f.getFquantity(),
                        f.getFprice(),
                        f.getFquantity() * f.getFprice() + "$");
                            total += f.getFquantity() * f.getFprice();
            }
            System.out.println("Total : " + total);
        }
      }
}
