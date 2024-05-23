package visitorPattern;
import java.sql.SQLOutput;
import java.text.DecimalFormat;


public class FurnitureShop {
    public static void main(String[] args) {
        //Decimal Format
        DecimalFormat df = new DecimalFormat("₱#,###.00");

        //Object Creation
        Furniture bed = new Furniture("Bed", 5000.00, 3.0); // Ship Distance in KM. Calculation for Ship Fee is ShipCost * Distance
        Furniture chair = new Furniture("Chair", 200.00, 5.0);
        Furniture lamp = new Furniture("Lamp", 150.00, 2.0);
        Furniture cabinet = new Furniture("Cabinet", 7000.00, 10.5);

        //Calculators Initialization
        HeavyCalculator heavyCalculator = new HeavyFurniture();
        LightCalculator lightCalculator = new LightFurniture();

        //Priniting Outputs

        System.out.println("[[[FuuunyTure Shop!]]]");
        System.out.println();


        System.out.println("[[HEAVY ORDERS]]");

        System.out.println();
        System.out.println("Item: " + bed.getFurnitureType());
        System.out.println("Item Original Price: " + df.format(bed.getPrice()));
        System.out.println("Shipping Distance: " + bed.getShipDistance() + " km");
        System.out.println("Final Cost: " + df.format(bed.accept(heavyCalculator, bed.getPrice(), bed.getShipDistance())));

        System.out.println();

        System.out.println("Item: " + cabinet.getFurnitureType());
        System.out.println("Item Original Price: " + df.format(cabinet.getPrice()));
        System.out.println("Shipping Distance: " + cabinet.getShipDistance() + " km");
        System.out.println("Final Cost: " + df.format(cabinet.accept(heavyCalculator, cabinet.getPrice(), cabinet.getShipDistance())));

        System.out.println();

        System.out.println("[[LIGHT ORDERS]]");

        System.out.println();
        System.out.println("Item: " + lamp.getFurnitureType());
        System.out.println("Item Original Price: " + df.format(lamp.getPrice()));
        System.out.println("Shipping Distance: " + lamp.getShipDistance() + " km");
        System.out.println("Final Cost: " + df.format(lamp.accept(lightCalculator, lamp.getPrice())));

        System.out.println();

        System.out.println("Item: " + chair.getFurnitureType());
        System.out.println("Item Original Price: " + df.format(chair.getPrice()));
        System.out.println("Shipping Distance: " + chair.getShipDistance() + " km");
        System.out.println("Final Cost: " + df.format(chair.accept(lightCalculator, chair.getPrice())));



    }
}