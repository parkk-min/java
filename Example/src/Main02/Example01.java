package Main02;

public class Example01 {
    public static void main(String[] args) {
        Bike myBike = new Bike();
        Car myCar = new Car();

        myBike.printType();
        myBike.printBrand();
        myBike.printPrice();
        System.out.println("-".repeat(30));
        myCar.printType();
        myCar.printBrand();
        myCar.printPrice();
    }
}
