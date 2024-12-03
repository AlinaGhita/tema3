public class Main {
    public static void main(String[] args) {
        Car car = new Logan(70, "23235657687"); // Logan can extend from Dacia, while Dacia extends from Car
        car.start();

        car.shiftGear(1);

        car.drive(0.01F); // drives 0.01 KMs

        car.shiftGear(2);

        car.drive(0.02F);

        car.shiftGear(3);

        car.drive(0.5F);

        car.shiftGear(4);

        car.drive(0.5F);

        car.shiftGear(4);

        car.drive(0.5F);

        car.shiftGear(5);

        car.drive(10);

        car.shiftGear(4);

        car.drive(0.5F);

        car.shiftGear(3);

        car.drive(0.1F);

        car.stop();

        Vehicles vehicle = new VWGolf(30, "1987ddkshik289"); // available fuel and chassis number

        vehicle.start();

        vehicle.drive(1);

        vehicle.stop();

        float availableFuel = car.getAvailableFuel();

        float fuelConsumedPer100Km = car.getAverageFuelConsumption();

        System.out.println("Available Fuel: " + car.getAvailableFuel());
        System.out.println("Fuel consumed per 100 km: " + car.getAverageFuelConsumption());



    }

}
