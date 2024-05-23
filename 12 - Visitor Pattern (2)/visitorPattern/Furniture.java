package visitorPattern;

public class Furniture implements ShippinCostCalculator{

    private String furnitureType;
    private double price;
    private double shipDistance;

    public Furniture(String furnitureType, double price, double shipDistance) {
        this.furnitureType = furnitureType;
        this.price = price;
        this.shipDistance = shipDistance;
    }


    @Override
    public double accept(HeavyCalculator heavyCalculator, double price, double shipDistance){
        return heavyCalculator.calculatePrice(furnitureType, price, shipDistance);
    }

    @Override
    public double accept(LightCalculator lightCalculator, double price){
        return lightCalculator.calculatePrice(furnitureType, price);
    }

    public String getFurnitureType() {
        return furnitureType;
    }

    public void setFurnitureType(String furnitureType) {
        this.furnitureType = furnitureType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getShipDistance() {
        return shipDistance;
    }

    public void setShipDistance(double shipDistance) {
        this.shipDistance = shipDistance;
    }

}
