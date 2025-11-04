public class Truck extends Vehicle {
    private double payloadCapacity;

    public Truck(String brand, int year, double price, double payloadCapacity) {
        super(brand, year, price);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void startEngine(){
        System.out.println("Truck engine starting with a rumble!");
    }

    @Override
    public void displayInfo(){
        super.displayInfo(); 
        System.out.println("Payload Capacity: " + payloadCapacity + " tons");
    }
}