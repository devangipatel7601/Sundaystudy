public class HondaChildAbs extends BikeParentAbs{
    //normal non-static method
    void run()
    {
        System.out.println("Running Safely");

    }

    public static void main(String[] args) {

        //assigning child class method to parent class or type casting
        BikeParentAbs bikeParentAbs = new HondaChildAbs();

        //calling non-static method in static area
        bikeParentAbs.run();


    }
}
