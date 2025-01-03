//Car is a vehicle
abstract class  Car extends Vehicles {
    //create the properties of car which cannot be modified using protected
    protected float availableFuel;
    protected int tireSize;
    protected String chassisNumber;
    protected String fuelType;
    protected float consumptionPer100Km;
    protected int currentGear;
    protected float fuelTankSize;
    protected int maxGear = 6;
    protected float fuelConsumed = 20;

    //Constructor1 of Car
    public Car(float availableFuel, String chassisNumber, int tireSize, float consumptionPer100Km,  String fuelType) {
        this.availableFuel = availableFuel;
        this.chassisNumber = chassisNumber;
        this.tireSize = tireSize;
        this.consumptionPer100Km = consumptionPer100Km;
        this.fuelType = fuelType;
    }

    @Override
    public void start() {
        isMoving = true;
        fuelTankSize = 0; //reset consumption
        System.out.println("Car started.");
    }

    public void drive(float km) {
        if (km < 0) {
            System.out.println("Invalid distance.");
            return;
        }
        float fuelConsumed = km * consumptionPer100Km / 100;
        availableFuel -= fuelConsumed;
        fuelTankSize += fuelConsumed;
        System.out.println("Drove " + km + " km, Fuel consumed: " + fuelConsumed + "L");
    }

    public float getAverageFuelConsumption() {
        //if availableFuel is 0 or negative then 1 will be used for division
        return fuelConsumed / (availableFuel > 0 ? availableFuel : 1) * 100;
    }

    @Override
    public float getAvailableFuel() {
        return availableFuel;
    }

    // Method to shift gears
    public void shiftGear(int gear) {
        if (gear > maxGear || gear < 1) {
            System.out.println("Invalid gear!");
        } else {
            this.currentGear = gear;
        }
    }

    @Override
    public void stop() {
        isMoving = false;
    }
}
