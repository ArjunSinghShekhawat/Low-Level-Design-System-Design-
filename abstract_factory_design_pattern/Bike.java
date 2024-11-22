package abstract_factory_design_pattern;

public abstract class Bike implements Vehicle{
    protected String bikeType;
    protected double baseCost;
    protected double chargePerUnitDistance;

    @Override
    public void book(double distance) {
        setVehicleType();
        setBaseCost();
        setVehicleChargePerUnitDistance();
        double cost = calculateCostOfBooking(distance);
        System.out.println("You Have Book a "+bikeType+" Bike For a Distance"+distance+" kms at a Total Cost "+cost+" .");
    }

    @Override
    public double calculateCostOfBooking(double distance) {
        return baseCost+chargePerUnitDistance*distance;
    }
}
