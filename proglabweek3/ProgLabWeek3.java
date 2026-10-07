package proglabweek3;

//Muhammed Yakub Bayır 
//1031510145
public class ProgLabWeek3 {

    
    public static void main(String[] args) {
        

        Car car1 = new Car("HB 06", "BMW", 50, 100);

        car1.showStatus();

        car1.drive(20);

        car1.showStatus();

        car1.refuel(60);

        car1.showStatus();

        car1.drive(1100);

        car1.showStatus();

        car1.drive(400);

        car1.showStatus();

        car1.drive(500);

        car1.showStatus();
    }
    
}
