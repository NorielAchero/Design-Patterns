package visitorPattern;

public interface ShippinCostCalculator {

    public double accept(HeavyCalculator heavyCalculator, double price, double shipDistance);
    public double accept(LightCalculator lightCalculator, double price);

}
