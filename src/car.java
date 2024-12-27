import java.util.ArrayList;
public class car {
    String model;
    String color;
    int year;
    ArrayList<String> maintainenceRecords = new ArrayList<>();
    

public car(String model, String color, int year, String maintainenceRecords){
    this.model = model; 
    this.color = color;
    this.year = year;
    this.maintainenceRecords = new ArrayList<>();
    
}

public void addMaintainenceRecords(String record){
    maintainenceRecords.add(record);

    
}
public ArrayList<String> getMaintainenceRecords(){
    return maintainenceRecords;
}

public String getmodel(){
    return model; 
}

public String getcolor(){
    return color; 
}

public int getyear(){
    return year; 
}

public void setmodel(String model){
    this.model = model;
}

public void setcolor(String color){
    this.color = color;
}

public void setyear(int year){
    this.year = year;
}

public void honk(){
    System.out.println("HONK");
}

public void mpg(){
    int mpg= 15;
    int milesDriven = 100;
    int milesPerGallon = milesDriven/mpg;
    System.out.println(milesPerGallon);
}


public String toString(){

    return "Model: " + model + " " + "Color: " + color + " " + "Year: " + year + " Maintainence Records: " + maintainenceRecords;
}


}



