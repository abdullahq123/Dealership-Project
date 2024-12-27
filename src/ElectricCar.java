import java.util.ArrayList;
public class ElectricCar extends car{

    private int batteryCapacity;
//added maintainence records
    public ElectricCar(String model, String color, int year, int batteryCapacity, String maintainenceRecords){
        super(model, color, year, maintainenceRecords);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity(){
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity){
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString(){

        return "Model: " + model + " " + "Color: " + color + " " + "Year: " + year + " " + "Battery Capacity: " + batteryCapacity + " " + "Maintainence Records: " + maintainenceRecords;
    }





}
