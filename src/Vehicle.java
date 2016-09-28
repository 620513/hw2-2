/**
 * Created by ThelmaAndrews on 9/23/16.
 */
import java.util.*;

    public class Vehicle {
        Vehicle()
        {
        }
        public int printVehicle(String vehicle_type)
        {
            String[] model=new String[5];
            int[] year=new int[5];
            String[] wheeler=new String[5];
            String[] retailPrice=new String[5];
            float[] milesPergallon=new float[5];
            Scanner scan=new Scanner(System.in);
            System.out.println("");
            if(vehicle_type.equals("Car"))
            {
                String[] convertible= new String[5];
                for(int i=0;i<2;i++)
                {
                    System.out.println("Enter the model:");
                    model[i]=scan.next();
                    System.out.println("Enter year:");
                    year[i]=scan.nextInt();
                    System.out.println("Four wheeler:");
                    wheeler[i]=scan.next();
                    System.out.println("Retail price:");
                    retailPrice[i]=scan.next();
                    System.out.println("Miles per gallon:");

                    milesPergallon[i]= scan.nextFloat();
                    System.out.println("convertible:" );
                    convertible[i]=scan.next();
                }
                for(int i=0;i<2;i++)
                {
                    System.out.print(" "+year[i]);
                    System.out.print(" ");
                    System.out.println(model[i]);
                    System.out.println("4 wheel drive: "+wheeler[i]);
                    System.out.println("Retail Price:"+retailPrice[i]);
                    System.out.println("Miles per Gallon:"+milesPergallon[i]);
                    System.out.println("Convertible : "+convertible[i]);
                    System.out.println("");
                    System.out.println("");
                }
            }
            if(vehicle_type.equals("Truck"))
            {
                float[] tow_capacity=new float[5];
                String[] side_Step= new String[5];
                for(int i=0;i<2;i++)
                {
                    System.out.println("Enter model:");
                    model[i]=scan.next();
                    System.out.println("Enter year:");
                    year[i]=scan.nextInt();
                    System.out.println("Enter wheeler:");
                    wheeler[i]=scan.next();
                    System.out.println("Enter retailPrice:");
                    retailPrice[i]=scan.next();
                    System.out.println("Enter miles Per gallon:");
                    milesPergallon[i]=scan.nextFloat();
                    System.out.println("Enter tow capacity:");
                    tow_capacity[i]=scan.nextFloat();
                    System.out.println("Enter side Step:");
                    side_Step[i]= scan.next();
                }
                for(int i=0;i<2;i++)
                {
                    System.out.print(" "+year[i]);
                    System.out.print(" ");
                    System.out.println(model[i]);
                    System.out.println("4 wheel drive: "+wheeler[i]);
                    System.out.println("Retail Price:"+retailPrice[i]);
                    System.out.println("Miles per Gallon:"+milesPergallon[i]);
                    System.out.println("Side Step:"+side_Step[i]);
                    System.out.println("Up To "+tow_capacity[i]+" tons");
                    System.out.println("");
                    System.out.println("");
                }
            }
            return 0;
        }
    }


