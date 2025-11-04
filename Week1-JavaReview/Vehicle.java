public class Vehicle {

    public static void main(String[] args){
        //Create an array of Vehicle references
        Vehicle[] garage = new Vehicle[3];

        //Add different types of vehicles to the garage
        garage[0] = new Car("Toyota", 2022, 25000, 4);
        garage[1] = new Truck("Ford", 2021, 45000, 2.5);
        garage[2] = new Car("Honda", 2023, 28000, 2);

        //Polymorphism in action
        for(Vehicle v : garage) {
            v.displayInfo();
            v.startEngine();
            System.out.println();
        }
    }



    // Attributes
    private String brand;
    private int year;
    private double price;

    // Constructor
    public Vehicle(String brand, int year, double price) {
        this.brand = brand;
        this.year = year;
        this.price = price;
    }
    // Getters
    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }
    // Methods
    public void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }

    public void startEngine(){
        System.out.println("Engine Starting...");
    }
}
