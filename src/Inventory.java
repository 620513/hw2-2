/**
 * Created by ThelmaAndrews on 9/23/16.
 */
import java.util.*;
public class Inventory {

        Scanner data = new Scanner(System.in);

        // Hardcoded values of the cars in Arraylist
        final int price1 = 20000; // 0
        final int price2 = 30000; // 1
        final int price3 = 10000;
        final int price4 = 40000;


        ArrayList Al = new ArrayList();


        public void Inventory() {

            System.out.println("[INVENTORY] - Welcome to Inventory! ");

            System.out.println("Available Cars for sale are as follows :-");
            Al.add("1 KIA - 2014 MODEL \n");
            Al.add("2 FORD - 2012 MODEL \n");
            Al.add("3 TOYOTA - 2001 MODEL\n");
            Al.add("4 TESLA - 2007 MODEL\n");
            Al.add("5 HONDA - 2002 MODEL\n");
            System.out.println(Al);

            System.out.println("");
            System.out.println("");
            System.out.println("Pick one of the following options :- ");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Cheapest Vehicle");
            System.out.println("4. Expensive Vehicle");
            System.out.println("5. Average of all the Vehicles");
            System.out.println("");
            System.out.println("");


            String dat = data.next();
            switch (dat) {
                case "1":
                    System.out.println("Enter the name of car to be added to the record!");
                    System.out.println("");
                    String newcar = data.next();
                    Add(newcar);
                    break;
                case "2":
                    System.out.println("Enter the number of the car to be deleted!");
                    int num = data.nextInt();
                    Remove(num);
                    break;
                case "3":
                    Cheapest();
                    break;
                case "4":
                    Expensive();
                    break;
                case "5":
                    Average();
                    break;
                default:
                    System.out.println("Please pick proper choice from the Menu!");
            }
        }

        public void Add(String newcar) {
            System.out.println(newcar + " Has been added to the current collection!");
            Al.add(5, newcar);
            System.out.println("Records have been updated as follows : ");
            System.out.println("");
            System.out.println("\n 6" + Al + "MODEL - TBD");


        }

        public void Remove(int num) {
            System.out.println(Al);
            Al.remove(num);
            System.out.println(Al);

        }

        public void Cheapest() {
            if (price1 < price2 && price1 < price3 && price1 < price4) {
                System.out.println(Al.indexOf(0) + " Is the cheapest car!");
            } else if (price2 < price3 && price2 < price4) {
                System.out.println(Al.indexOf(1) + " Is the cheapest car!");
            } else if (price3 < price4) {
                System.out.println(Al.indexOf(2) + " Is the cheapest car!");
            } else {
                System.out.println(Al.indexOf(3) + " Is the cheapest car!");
            }
        }


        public void Expensive() {

            if (price1 > price2 && price1 > price3 && price1 > price4) {
                System.out.println(Al.indexOf(0) + " Is the costliest car!");
            } else if (price2 > price3 && price2 > price4) {
                System.out.println(Al.indexOf(1) + " Is the costliest car!");
            } else if (price3 > price4) {
                System.out.println(Al.indexOf(2) + " Is the costliest car!");
            } else {
                System.out.println(Al.indexOf(3) + " Is the costliest car!");
            }

        }

        public void Average() {

            int avg = (price1 + price2 + price3 + price4) / 4;
            System.out.println("Average price of all the cars is " + avg);

        }


    }





