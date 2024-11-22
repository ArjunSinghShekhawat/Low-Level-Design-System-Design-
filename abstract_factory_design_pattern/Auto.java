package abstract_factory_design_pattern;

public abstract class Auto implements Vehicle{

    protected String autoType;
    protected double baseCost;
    protected double chargePerUnitDistance;

    @Override
    public void book(double distance) {
        setVehicleType();
        setBaseCost();
        setVehicleChargePerUnitDistance();
        double cost = calculateCostOfBooking(distance);
        System.out.println("You Have Book a "+autoType+" Auto For a Distance"+distance+" kms at a Total Cost "+cost+" .");
    }

    @Override
    public double calculateCostOfBooking(double distance) {
        double serviceCharge=2.5;
        return baseCost+chargePerUnitDistance*distance+serviceCharge;
    }
}
