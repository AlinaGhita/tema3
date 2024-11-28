abstract class Vehicles {
    protected boolean isMoving;

    //interface for start the car
    public void start(){
        System.out.println("Vehicle has been started.");
    }
    //interface for stop the car
    public void stop(){
        System.out.println("Vehicle has been stopped.");
    }

    //interface for drive the car
    public void drive(float kilometers){
        System.out.println("Vehicle has been driven.");
    }

    public abstract float getAverageFuelConsumption();
    public abstract float getAvailableFuel();
}
