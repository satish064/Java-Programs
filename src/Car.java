public class Car {

    int noOfWheels;

    String color;

    float maxSpeed;

    float currentFuelInLiters;

    int noOfSeats;

    Car(String color) {
        noOfWheels = 4;
        this.color = color;
        maxSpeed = 150;
        currentFuelInLiters = 2;
        noOfSeats = 5;
    }

    Car() {
        this("Black");
        currentFuelInLiters = 5;

    }

    public void drive(){
        System.out.println("Car is driving");
        currentFuelInLiters--;
    }

    public void addFuel(float currentFuelInLiters){
        this.currentFuelInLiters = currentFuelInLiters;
    }

    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }
    public Car start() {
        if(currentFuelInLiters == 0) {
            System.out.println("Car is out of fuel, can not start");
        } else if (currentFuelInLiters < 5) {
            System.out.println("Car  is in reserved mode, please refuel");
        } else  {
            System.out.println("Car is started.. bruhhh........");
        }
        return this;
    }


}
