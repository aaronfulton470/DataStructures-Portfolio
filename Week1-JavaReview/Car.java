public class Car extends Vehicle {
    private int numberOfDoors;

    public Car (String brand, int year, double price, int numberOfDoors) {
        super(brand, year, price);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public void startEngine(){
        System.out.println("Car engine starting with a roar!");
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}