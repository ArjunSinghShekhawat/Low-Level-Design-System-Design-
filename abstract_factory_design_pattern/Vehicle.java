package abstract_factory_design_pattern;

public interface Vehicle {
    void book(double distance);
    void setVehicleType();
    void setBaseCost();
    void setVehicleChargePerUnitDistance();
    double calculateCostOfBooking(double distance);
}
