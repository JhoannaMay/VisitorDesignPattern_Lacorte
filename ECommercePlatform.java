// Client Code
import java.util.ArrayList;
import java.util.List;

public class ECommercePlatform {
    public static void main(String[] args) {
        List<Furniture> furnitureList = new ArrayList<>();
        furnitureList.add(new Chair(5.0));
        furnitureList.add(new Table(20.0));
        furnitureList.add(new Sofa(50.0, 100.0));

        ShippingCostVisitor calculator = new StandardShippingCalculator();

        for (Furniture item : furnitureList) {
            System.out.println("Shipping Cost: $" + item.accept(calculator));
        }
    }
}
