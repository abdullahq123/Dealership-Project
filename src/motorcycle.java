import java.util.ArrayList;

public class motorcycle extends car {


// added maintainence records
    public motorcycle(String model, String color, int year, String maintainenceRecords){
        super(model, color, year, maintainenceRecords);
        
    }


    @Override
    public void honk() {
        System.out.println("HONK HONK");
    }

    @Override
    public void mpg(){
    int mpg= 20;
    int milesDriven = 100;
    int milesPerGallon = milesDriven/mpg;
    System.out.println(milesPerGallon);
    }


}
