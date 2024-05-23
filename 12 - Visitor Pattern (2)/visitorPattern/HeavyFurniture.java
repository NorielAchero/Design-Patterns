package visitorPattern;

public class HeavyFurniture implements HeavyCalculator{

    @Override
    public double calculatePrice(String furnitureType, double price, double shipDistance) {
        double shippingRate = getShippingRate(furnitureType);
        double shippingCost = shipDistance * shippingRate;
        return price + shippingCost;
    }

    private double getShippingRate(String furnitureType) {
        switch (furnitureType) {
            case "Table":
                return 50.0;
            case "Bed":
                return 55.0;
            case "Cabinet":
                return 60.0;
            default:
                return 0.0;
        }
    }
}
