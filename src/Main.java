import java.util.*;
public class Main{
    public static void main(String[] args){

    //Create arraylist to add to the list
       // car car = new car("BMW", "Black", 2024, "Oil Change");
        //motorcycle motorcycle = new motorcycle("Yamaha", "Red", 2023, "Oil Change");
        
        //Array to hold my car objects called vehicles: the number 3 is the size of the array
        car[] vehicles = new car[3];
        
        vehicles[0] = new car("BMW", "Black", 2024, "Oil Change");
        vehicles[1] = new motorcycle("Yamaha", "Red", 2023, "Oil Change");
        vehicles[2] = new ElectricCar("Tesla", "Blue", 2022, 100, "Oil Change");

        // Car, Motorcycle, ElectricCar Objects with parameters. 

        car car1 = new car("BMW", "Black", 2024, "Oil Change");
        motorcycle motorcycle1 = new motorcycle("Yamaha", "Red", 2023 , "Oil Change");
        ElectricCar electricCar1 = new ElectricCar("Tesla", "Blue", 2022, 100, "Battery Change");

        //I have a method I created called addMaintainenceRecords in the car class. This method will add maintainence records to the maintainenceRecords ArrayList.
        car1.addMaintainenceRecords("Oil change on 2024-03-15");
        electricCar1.addMaintainenceRecords("Tire rotation on 2024-05-10");
        motorcycle1.addMaintainenceRecords("Chain adjustment on 2024-04-20");


        

       /*  for (car vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }

        System.out.println(vehicles[0].toString()); */


        System.out.println(motorcycle1.toString());
        System.out.println(car1.toString());
        System.out.println(electricCar1.toString());
        car1.honk();
        motorcycle1.honk();
        car1.mpg();
        motorcycle1.mpg();
       // System.out.println(electricCar1.toString()); 


    }
}