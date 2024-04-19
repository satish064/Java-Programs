public class Driver {

    static int minAgeForDriving = 18;

    int age;
    public boolean isAllowedToDrive() {
        return this.age >=minAgeForDriving;
    }
    public static void main(String[] args) {
      /*  Car myCar = new Car();
        myCar.drive();
        System.out.println(myCar.getCurrentFuelLevel());*/
        Car swift = new Car("Yellow");
      //  swift.addFuel(6);
        swift.start().drive();
        System.out.println(swift.color);



    }

}
