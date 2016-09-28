/**
 * Created by ThelmaAndrews on 9/23/16.
 */

import java.util.*;
    public class Main {
        public static void main(String[] args) {
// write your code here
            int i=0;
            System.out.println("Choose the type of vehicle \n 1.Car \n 2.Truck");
            Scanner sc=new Scanner(System.in);
            i=sc.nextInt();
            if(i==1)
            {
                Car c=new Car();
            }
            else if(i==2)
            {
                Truck t= new Truck();
            }
            else
            {
                System.out.println("invalid");
            }
        }
    }
