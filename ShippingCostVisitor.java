// Visitor Interface
public interface ShippingCostVisitor {
    double calculateShipping(Chair chair);
    double calculateShipping(Table table);
    double calculateShipping(Sofa sofa);
}
