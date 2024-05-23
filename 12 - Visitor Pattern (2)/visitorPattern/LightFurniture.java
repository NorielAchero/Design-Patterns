package visitorPattern;

public class LightFurniture implements LightCalculator{

    @Override
    public double calculatePrice(String furnitureType, double price){
        return price + getShippingRate(furnitureType);//Flat shipping, so calculation needed
    }

    private double getShippingRate(String furnitureType) {
        switch (furnitureType) {
            case "Chair":
                return 50.0;
            case "CenterTable":
                return 55.0;
            case "Lamp":
                return 30.0;
            default:
                return 0.0;
        }
    }



}
