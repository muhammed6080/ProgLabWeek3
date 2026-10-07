package proglabweek3;


public class Car {
    public String plateNumber;
    public String model;
    public int millage = 0;
    public double fuelLevel;
    public double tankCapacity;

    public Car(String plateNumber, String model, double fuelLevel, double tankCapacity) {
        this.plateNumber = plateNumber;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.tankCapacity = tankCapacity;
    }

    public void drive(int km){

        if(fuelLevel < km/10){
            System.out.println("Not enough fuel for trip");
               
        }
        else{
            System.out.println("Succesfully drove");
            fuelLevel -= km/10;
            millage += km;
        }
    }

    public void refuel(int fuel){

        if(fuelLevel + fuel >tankCapacity ){
            System.out.println("Tank is full , extra fuel is discarded = " + (fuel+fuelLevel -tankCapacity));
            fuelLevel = tankCapacity;
        }
        else{
            fuelLevel += fuel;
            System.out.println("Fuel refilled");
        }
        
    }

    public void showStatus(){

        System.out.println("Car name: " +model + " Car plate: "+plateNumber+" Millage is: " + millage + " Fuel level: "+fuelLevel+"/"+tankCapacity);
        if(fuelLevel <= tankCapacity/10){
            System.out.println("Warning fuel 10 percentage");
        }

    }

    
}

